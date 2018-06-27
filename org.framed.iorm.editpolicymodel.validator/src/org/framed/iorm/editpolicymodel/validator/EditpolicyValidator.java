package org.framed.iorm.editpolicymodel.validator;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import com.microsoft.z3.Context;

import editpolicymodel.*;
import editpolicymodel.Model;

public class EditpolicyValidator {
	
	static List<Model> models = new LinkedList<>();
	static SubsumptionSolver sSolver = new SubsumptionSolver();

	public static void main(String[] args) {
		System.out.println("Loading all files:");
		List<File> fileList = new LinkedList<>();
		EditpolicyValidator.getAllEditpolicyFiles("../../FRaMED-2.0/org.framed.iorm.ui/", fileList);
		for (File file : fileList) {
			EditpolicyValidator.loadEditPolicyFile(file.getAbsolutePath());
		}
		for(Model m: EditpolicyValidator.models) {
			EditpolicyValidator.checkModel(m);
		}
		System.out.println("starting Subsumtion Solver...");
		EditpolicyValidator.sSolver.checkForSubsumtions();
	}

	private static void checkModel(Model model) {
		for (Policy p : model.getPolicies()) {
			//EditpolicyValidator.checkConstraint(p.getConstraintRule());
			//EditpolicyValidator.checkFeature(p.getFeatureRule());
			EditpolicyValidator.sSolver.addPolicy(p);
		}
	}

	private static void checkConstraint(ConstraintRule r) {
		System.out.println("checking Constraint: " + r.toString());
		LogicSolver<ConstraintRule> constraintSolver = new LogicSolver<>(new Context());
		constraintSolver.parseRule(r);
		constraintSolver.isSatisfiable();
	}

	private static void checkFeature(FeatureRule r) {
		System.out.println("checking Feature: " + r.toString());
		LogicSolver<FeatureRule> featureSolver = new LogicSolver<>(new Context());
		featureSolver.parseRule(r);
		featureSolver.isSatisfiable();
	}

	/*
	 * Load editPolicy Model from file.
	 */
	private static void loadEditPolicyFile(String filename) {
		System.out.println("EDITPOLICY loading: " + filename);

		try {
			ResourceSet set = new ResourceSetImpl();

			set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
					new EcoreResourceFactoryImpl());
			set.getPackageRegistry().put(editpolicymodelPackage.eNS_URI, editpolicymodelPackage.eINSTANCE);

			Resource res = set.createResource(URI.createURI(filename));
			res.load(Collections.EMPTY_MAP);
			if (res.getContents().size() > 0 && res.getContents().get(0) instanceof editpolicymodel.Model) {
				EditpolicyValidator.models.add((editpolicymodel.Model) res.getContents().get(0));
			} else {
				System.err.println("Was not able to load xmi: \"" + filename + "\" due : null");
			}
		} catch (Exception e) {
			System.err.println("Was not able to load xmi:  \"" + filename + "\" due : " + e.toString());
			for (StackTraceElement el : e.getStackTrace())
				System.err.println(el.toString());
		}
	}

	public static void getAllEditpolicyFiles(String directoryName, List<File> files) {
		File directory = new File(directoryName);

		// Get all the files from a directory.
		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isFile() && file.getName().endsWith(".editpolicy")) {
				files.add(file);
			} else if (file.isDirectory()) {
				getAllEditpolicyFiles(file.getAbsolutePath(), files);
			}
		}
	}
}


