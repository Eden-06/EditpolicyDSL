package org.framed.iorm.editpolicymodel.validator;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import java.util.LinkedList;

import com.microsoft.z3.Context;

import editpolicymodel.*;
import editpolicymodel.Model;

public class EditpolicyValidator {
	
	static List<Model> models = new LinkedList<>();
	static SubsumptionSolver sSolver = new SubsumptionSolver();

	public static void main(String[] args) {
		List<File> fileList = new LinkedList<>();
		//EditpolicyValidator.getAllEditpolicyFiles("../../FRaMED-2.0-develop/org.framed.iorm.ui/modules/", fileList);
		//EditpolicyValidator.getAllEditpolicyFiles("../../FRaMED-2.0-develop/org.framed.iorm.ui/core/", fileList);
		EditpolicyValidator.getAllEditpolicyFiles("./testpolicies/", fileList);
		for (File file : fileList) {
			EditpolicyValidator.loadEditPolicyFile(file.getAbsolutePath());
		}
		System.out.println("Reading Policies, checking satisfiability...");

		for(Model m: EditpolicyValidator.models) {
			EditpolicyValidator.checkModel(m);
		}
		System.out.println("Checking whether policies are subsumed by other rules...");
		EditpolicyValidator.sSolver.checkForSubsumtions();
		System.out.println("finished");
	}

	private static void checkModel(Model model) {
		for (Policy p : model.getPolicies()) {
			EditpolicyValidator.checkFeature(p);
			EditpolicyValidator.checkConstraint(p);
			EditpolicyValidator.sSolver.addPolicy(p);
		}
	}

	public static String getNameForPolicy(Policy p) {
		String type = null;
		if(p.getActionType() != null) {
			type = p.getActionType().getName();
		} 
		return p.getAction().getName() + type;
	}
	
	private static void checkConstraint(Policy p) {
		LogicSolver<ConstraintRule> constraintSolver = new LogicSolver<>(new Context());
		constraintSolver.parseRule(p.getConstraintRule());
		constraintSolver.isSatisfiable(getNameForPolicy(p));
	}

	private static void checkFeature(Policy p) {
		LogicSolver<FeatureRule> featureSolver = new LogicSolver<>(new Context());
		featureSolver.parseRule(p.getFeatureRule());
		featureSolver.isSatisfiable(getNameForPolicy(p));
	}

	/*
	 * Load editPolicy Model from file.
	 */
	private static void loadEditPolicyFile(String filename) {
		System.out.println("loading: ..." + filename.substring(Math.max(filename.length()-100,0), filename.length()));

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
		File[] fList = directory.listFiles();
		if(fList == null) return;
		for (File file : fList) {
			if (file.isFile() && file.getName().endsWith(".editpolicy")) {
				files.add(file);
			} else if (file.isDirectory()) {
				getAllEditpolicyFiles(file.getAbsolutePath(), files);
			}
		}
	}
}


