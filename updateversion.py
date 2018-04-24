#!/usr/bin/env python
import os
import os.path
from lxml import etree
from __builtin__ import raw_input

ns = "http://maven.apache.org/POM/4.0.0"

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
    with open(pom, 'wb') as fp:
        fp.write('<?xml version="1.0" encoding="UTF-8"?>\n')
        dom.write(fp)

def update_feature(v, feature):
    print(feature)
    dom = etree.parse(feature)
    root = dom.getroot()
    root.attrib['version'] = v
    with open(feature, 'wb') as fp:
        fp.write('<?xml version="1.0" encoding="UTF-8"?>\n')
        dom.write(fp)

def update_product(v, product):
    print(product)
    dom = etree.parse(product)
    root = dom.getroot()
    root.attrib['version'] = v
    features = root.find('features')
    if features:
        for f in features:
            f.attrib['version'] = v
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
    
update_version("1.5.0")
