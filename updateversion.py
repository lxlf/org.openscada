#!/usr/bin/env python
import os
import os.path
from lxml import etree
from __builtin__ import raw_input

VERSION = "1.5.0"
ns = "http://maven.apache.org/POM/4.0.0"

fixed_versions = [
    ('org.openscada.external.postgresql', '9.3.1101'),
    ('org.openscada.external.odfdom', '0.8.7'),
    ('org.openscada.external.snmp4j', '2.2.5'),
    ('org.openscada.external.jcifs', '1.2.25'),
    ('org.openscada.jinterop.core', '2.1.8')
    ]
def update_pom(v, pom):
    print(pom)
    dom = etree.parse(pom)
    root = dom.getroot()
    parent = root.find('{%s}parent' % ns)
    if parent:
        version = parent.find('{%s}version' % ns)
        if version is not None:
            version.text = v
    version = root.find('{%s}version' % ns)
    if version is not None:
        version.text = v
        for fb, fv in fixed_versions:
            if fb in pom:
                if ('-SNAPSHOT' in v):
                    version.text = fv + '-SNAPSHOT'
                else:
                    version.text = fv
    with open(pom, 'wb') as fp:
        fp.write('<?xml version="1.0" encoding="UTF-8"?>\n')
        dom.write(fp)

def update_feature(v, feature):
    print(feature)
    dom = etree.parse(feature)
    root = dom.getroot()
    root.attrib['version'] = v.replace('-SNAPSHOT', '.qualifier')
    with open(feature, 'wb') as fp:
        fp.write('<?xml version="1.0" encoding="UTF-8"?>\n')
        dom.write(fp)

def update_product(v, product):
    print(product)
    dom = etree.parse(product)
    root = dom.getroot()
    root.attrib['version'] = v.replace('-SNAPSHOT', '')
    features = root.find('features')
    if features:
        for f in features:
            f.attrib['version'] = v.replace('-SNAPSHOT', '')
    with open(product, 'wb') as fp:
        fp.write('<?xml version="1.0" encoding="UTF-8"?>\n')
        dom.write(fp)

def update_version(version):
    for root, dirs, files in os.walk("."):
        if (os.path.exists(root + '/pom.xml')):
            update_pom(version, root + '/pom.xml')
        if (os.path.exists(root + '/feature.xml')):
            update_feature(version, root + '/feature.xml')
        for product in [p for p in os.listdir(root) if p.endswith('.product')]:
            update_product(version, root + '/' + product)
    
os.chdir("releng/superParent")
os.system("mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=" + VERSION)
os.chdir("../..")
for b, v in fixed_versions:
    f = b.split('.')[2]
    os.chdir(f + '/' + b)
    if ('SNAPSHOT' in VERSION):
        os.system("mvn -o org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=" + v + '-SNAPSHOT')
    else:
        os.system("mvn -o org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=" + v)
    os.chdir("../..")
