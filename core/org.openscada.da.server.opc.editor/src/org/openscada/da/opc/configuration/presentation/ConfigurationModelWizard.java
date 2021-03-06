/**
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2013 Jens Reimann (ctron@dentrassi.de)
 * 
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 * 
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 */
package org.openscada.da.opc.configuration.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.CommonPlugin;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import org.openscada.da.opc.configuration.ConfigurationFactory;
import org.openscada.da.opc.configuration.ConfigurationPackage;
import org.openscada.da.opc.configuration.provider.OpcEditPlugin;

import org.eclipse.core.runtime.Path;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationModelWizard extends Wizard implements INewWizard
{
    /**
     * The supported extensions for created files.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList ( Arrays.asList ( OpcEditorPlugin.INSTANCE.getString ( "_UI_ConfigurationEditorFilenameExtensions" ).split ( "\\s*,\\s*" ) ) ); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * A formatted list of supported file extensions, suitable for display.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String FORMATTED_FILE_EXTENSIONS = OpcEditorPlugin.INSTANCE.getString ( "_UI_ConfigurationEditorFilenameExtensions" ).replaceAll ( "\\s*,\\s*", ", " ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    /**
     * This caches an instance of the model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigurationPackage configurationPackage = ConfigurationPackage.eINSTANCE;

    /**
     * This caches an instance of the model factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigurationFactory configurationFactory = configurationPackage.getConfigurationFactory ();

    /**
     * This is the file creation page.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigurationModelWizardNewFileCreationPage newFileCreationPage;

    /**
     * This is the initial object creation page.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigurationModelWizardInitialObjectCreationPage initialObjectCreationPage;

    /**
     * Remember the selection during initialization for populating the default container.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IStructuredSelection selection;

    /**
     * Remember the workbench during initialization.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IWorkbench workbench;

    /**
     * Caches the names of the features representing global elements.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected List<String> initialObjectNames;

    /**
     * This just records the information.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void init ( IWorkbench workbench, IStructuredSelection selection )
    {
        this.workbench = workbench;
        this.selection = selection;
        setWindowTitle ( OpcEditorPlugin.INSTANCE.getString ( "_UI_Wizard_label" ) ); //$NON-NLS-1$
        setDefaultPageImageDescriptor ( ExtendedImageRegistry.INSTANCE.getImageDescriptor ( OpcEditorPlugin.INSTANCE.getImage ( "full/wizban/NewConfiguration" ) ) ); //$NON-NLS-1$
    }

    /**
     * Returns the names of the features representing global elements.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<String> getInitialObjectNames ()
    {
        if ( initialObjectNames == null )
        {
            initialObjectNames = new ArrayList<String> ();
            for ( EStructuralFeature eStructuralFeature : ExtendedMetaData.INSTANCE.getAllElements ( ExtendedMetaData.INSTANCE.getDocumentRoot ( configurationPackage ) ) )
            {
                if ( eStructuralFeature.isChangeable () )
                {
                    EClassifier eClassifier = eStructuralFeature.getEType ();
                    if ( eClassifier instanceof EClass )
                    {
                        EClass eClass = (EClass)eClassifier;
                        if ( !eClass.isAbstract () )
                        {
                            initialObjectNames.add ( eStructuralFeature.getName () );
                        }
                    }
                }
            }
            Collections.sort ( initialObjectNames, CommonPlugin.INSTANCE.getComparator () );
        }
        return initialObjectNames;
    }

    /**
     * Create a new model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EObject createInitialModel ()
    {
        EClass eClass = ExtendedMetaData.INSTANCE.getDocumentRoot ( configurationPackage );
        EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature ( initialObjectCreationPage.getInitialObjectName () );
        EObject rootObject = configurationFactory.create ( eClass );
        rootObject.eSet ( eStructuralFeature, EcoreUtil.create ( (EClass)eStructuralFeature.getEType () ) );
        return rootObject;
    }

    /**
     * Do the work after everything is specified.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean performFinish ()
    {
        try
        {
            // Remember the file.
            //
            final IFile modelFile = getModelFile ();

            // Do the work within an operation.
            //
            WorkspaceModifyOperation operation = new WorkspaceModifyOperation () {
                @Override
                protected void execute ( IProgressMonitor progressMonitor )
                {
                    try
                    {
                        // Create a resource set
                        //
                        ResourceSet resourceSet = new ResourceSetImpl ();

                        // Get the URI of the model file.
                        //
                        URI fileURI = URI.createPlatformResourceURI ( modelFile.getFullPath ().toString (), true );

                        // Create a resource for this file.
                        //
                        Resource resource = resourceSet.createResource ( fileURI );

                        // Add the initial model object to the contents.
                        //
                        EObject rootObject = createInitialModel ();
                        if ( rootObject != null )
                        {
                            resource.getContents ().add ( rootObject );
                        }

                        // Save the contents of the resource to the file system.
                        //
                        Map<Object, Object> options = new HashMap<Object, Object> ();
                        options.put ( XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding () );
                        resource.save ( options );
                    }
                    catch ( Exception exception )
                    {
                        OpcEditorPlugin.INSTANCE.log ( exception );
                    }
                    finally
                    {
                        progressMonitor.done ();
                    }
                }
            };

            getContainer ().run ( false, false, operation );

            // Select the new file resource in the current view.
            //
            IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow ();
            IWorkbenchPage page = workbenchWindow.getActivePage ();
            final IWorkbenchPart activePart = page.getActivePart ();
            if ( activePart instanceof ISetSelectionTarget )
            {
                final ISelection targetSelection = new StructuredSelection ( modelFile );
                getShell ().getDisplay ().asyncExec ( new Runnable () {
                    public void run ()
                    {
                        ( (ISetSelectionTarget)activePart ).selectReveal ( targetSelection );
                    }
                } );
            }

            // Open an editor on the new file.
            //
            try
            {
                page.openEditor ( new FileEditorInput ( modelFile ), workbench.getEditorRegistry ().getDefaultEditor ( modelFile.getFullPath ().toString () ).getId () );
            }
            catch ( PartInitException exception )
            {
                MessageDialog.openError ( workbenchWindow.getShell (), OpcEditorPlugin.INSTANCE.getString ( "_UI_OpenEditorError_label" ), exception.getMessage () ); //$NON-NLS-1$
                return false;
            }

            return true;
        }
        catch ( Exception exception )
        {
            OpcEditorPlugin.INSTANCE.log ( exception );
            return false;
        }
    }

    /**
     * This is the one page of the wizard.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public class ConfigurationModelWizardNewFileCreationPage extends WizardNewFileCreationPage
    {
        /**
         * Pass in the selection.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ConfigurationModelWizardNewFileCreationPage ( String pageId, IStructuredSelection selection )
        {
            super ( pageId, selection );
        }

        /**
         * The framework calls this to see if the file is correct.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected boolean validatePage ()
        {
            if ( super.validatePage () )
            {
                String extension = new Path ( getFileName () ).getFileExtension ();
                if ( extension == null || !FILE_EXTENSIONS.contains ( extension ) )
                {
                    String key = FILE_EXTENSIONS.size () > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension"; //$NON-NLS-1$ //$NON-NLS-2$
                    setErrorMessage ( OpcEditorPlugin.INSTANCE.getString ( key, new Object[] { FORMATTED_FILE_EXTENSIONS } ) );
                    return false;
                }
                return true;
            }
            return false;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public IFile getModelFile ()
        {
            return ResourcesPlugin.getWorkspace ().getRoot ().getFile ( getContainerFullPath ().append ( getFileName () ) );
        }
    }

    /**
     * This is the page where the type of object to create is selected.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public class ConfigurationModelWizardInitialObjectCreationPage extends WizardPage
    {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected Combo initialObjectField;

        /**
         * @generated
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         */
        protected List<String> encodings;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected Combo encodingField;

        /**
         * Pass in the selection.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ConfigurationModelWizardInitialObjectCreationPage ( String pageId )
        {
            super ( pageId );
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void createControl ( Composite parent )
        {
            Composite composite = new Composite ( parent, SWT.NONE );
            {
                GridLayout layout = new GridLayout ();
                layout.numColumns = 1;
                layout.verticalSpacing = 12;
                composite.setLayout ( layout );

                GridData data = new GridData ();
                data.verticalAlignment = GridData.FILL;
                data.grabExcessVerticalSpace = true;
                data.horizontalAlignment = GridData.FILL;
                composite.setLayoutData ( data );
            }

            Label containerLabel = new Label ( composite, SWT.LEFT );
            {
                containerLabel.setText ( OpcEditorPlugin.INSTANCE.getString ( "_UI_ModelObject" ) ); //$NON-NLS-1$

                GridData data = new GridData ();
                data.horizontalAlignment = GridData.FILL;
                containerLabel.setLayoutData ( data );
            }

            initialObjectField = new Combo ( composite, SWT.BORDER );
            {
                GridData data = new GridData ();
                data.horizontalAlignment = GridData.FILL;
                data.grabExcessHorizontalSpace = true;
                initialObjectField.setLayoutData ( data );
            }

            for ( String objectName : getInitialObjectNames () )
            {
                initialObjectField.add ( getLabel ( objectName ) );
            }

            if ( initialObjectField.getItemCount () == 1 )
            {
                initialObjectField.select ( 0 );
            }
            initialObjectField.addModifyListener ( validator );

            Label encodingLabel = new Label ( composite, SWT.LEFT );
            {
                encodingLabel.setText ( OpcEditorPlugin.INSTANCE.getString ( "_UI_XMLEncoding" ) ); //$NON-NLS-1$

                GridData data = new GridData ();
                data.horizontalAlignment = GridData.FILL;
                encodingLabel.setLayoutData ( data );
            }
            encodingField = new Combo ( composite, SWT.BORDER );
            {
                GridData data = new GridData ();
                data.horizontalAlignment = GridData.FILL;
                data.grabExcessHorizontalSpace = true;
                encodingField.setLayoutData ( data );
            }

            for ( String encoding : getEncodings () )
            {
                encodingField.add ( encoding );
            }

            encodingField.select ( 0 );
            encodingField.addModifyListener ( validator );

            setPageComplete ( validatePage () );
            setControl ( composite );
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ModifyListener validator = new ModifyListener () {
            public void modifyText ( ModifyEvent e )
            {
                setPageComplete ( validatePage () );
            }
        };

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected boolean validatePage ()
        {
            return getInitialObjectName () != null && getEncodings ().contains ( encodingField.getText () );
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setVisible ( boolean visible )
        {
            super.setVisible ( visible );
            if ( visible )
            {
                if ( initialObjectField.getItemCount () == 1 )
                {
                    initialObjectField.clearSelection ();
                    encodingField.setFocus ();
                }
                else
                {
                    encodingField.clearSelection ();
                    initialObjectField.setFocus ();
                }
            }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getInitialObjectName ()
        {
            String label = initialObjectField.getText ();

            for ( String name : getInitialObjectNames () )
            {
                if ( getLabel ( name ).equals ( label ) )
                {
                    return name;
                }
            }
            return null;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getEncoding ()
        {
            return encodingField.getText ();
        }

        /**
         * Returns the label for the specified feature name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected String getLabel ( String featureName )
        {
            try
            {
                return OpcEditPlugin.INSTANCE.getString ( "_UI_DocumentRoot_" + featureName + "_feature" ); //$NON-NLS-1$ //$NON-NLS-2$
            }
            catch ( MissingResourceException mre )
            {
                OpcEditorPlugin.INSTANCE.log ( mre );
            }
            return featureName;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected Collection<String> getEncodings ()
        {
            if ( encodings == null )
            {
                encodings = new ArrayList<String> ();
                for ( StringTokenizer stringTokenizer = new StringTokenizer ( OpcEditorPlugin.INSTANCE.getString ( "_UI_XMLEncodingChoices" ) ); stringTokenizer.hasMoreTokens (); ) //$NON-NLS-1$
                {
                    encodings.add ( stringTokenizer.nextToken () );
                }
            }
            return encodings;
        }
    }

    /**
     * The framework calls this to create the contents of the wizard.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addPages ()
    {
        // Create a page, set the title, and the initial model file name.
        //
        newFileCreationPage = new ConfigurationModelWizardNewFileCreationPage ( "Whatever", selection ); //$NON-NLS-1$
        newFileCreationPage.setTitle ( OpcEditorPlugin.INSTANCE.getString ( "_UI_ConfigurationModelWizard_label" ) ); //$NON-NLS-1$
        newFileCreationPage.setDescription ( OpcEditorPlugin.INSTANCE.getString ( "_UI_ConfigurationModelWizard_description" ) ); //$NON-NLS-1$
        newFileCreationPage.setFileName ( OpcEditorPlugin.INSTANCE.getString ( "_UI_ConfigurationEditorFilenameDefaultBase" ) + "." + FILE_EXTENSIONS.get ( 0 ) ); //$NON-NLS-1$ //$NON-NLS-2$
        addPage ( newFileCreationPage );

        // Try and get the resource selection to determine a current directory for the file dialog.
        //
        if ( selection != null && !selection.isEmpty () )
        {
            // Get the resource...
            //
            Object selectedElement = selection.iterator ().next ();
            if ( selectedElement instanceof IResource )
            {
                // Get the resource parent, if its a file.
                //
                IResource selectedResource = (IResource)selectedElement;
                if ( selectedResource.getType () == IResource.FILE )
                {
                    selectedResource = selectedResource.getParent ();
                }

                // This gives us a directory...
                //
                if ( selectedResource instanceof IFolder || selectedResource instanceof IProject )
                {
                    // Set this for the container.
                    //
                    newFileCreationPage.setContainerFullPath ( selectedResource.getFullPath () );

                    // Make up a unique new name here.
                    //
                    String defaultModelBaseFilename = OpcEditorPlugin.INSTANCE.getString ( "_UI_ConfigurationEditorFilenameDefaultBase" ); //$NON-NLS-1$
                    String defaultModelFilenameExtension = FILE_EXTENSIONS.get ( 0 );
                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension; //$NON-NLS-1$
                    for ( int i = 1; ( (IContainer)selectedResource ).findMember ( modelFilename ) != null; ++i )
                    {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension; //$NON-NLS-1$
                    }
                    newFileCreationPage.setFileName ( modelFilename );
                }
            }
        }
        initialObjectCreationPage = new ConfigurationModelWizardInitialObjectCreationPage ( "Whatever2" ); //$NON-NLS-1$
        initialObjectCreationPage.setTitle ( OpcEditorPlugin.INSTANCE.getString ( "_UI_ConfigurationModelWizard_label" ) ); //$NON-NLS-1$
        initialObjectCreationPage.setDescription ( OpcEditorPlugin.INSTANCE.getString ( "_UI_Wizard_initial_object_description" ) ); //$NON-NLS-1$
        addPage ( initialObjectCreationPage );
    }

    /**
     * Get the file from the page.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IFile getModelFile ()
    {
        return newFileCreationPage.getModelFile ();
    }

}
