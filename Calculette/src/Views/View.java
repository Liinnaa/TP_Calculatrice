package Views;

import java.util.Scanner;

import Controllers.Calculatrice;

import settings.ApplicationConfiguration;

public class View {
	
	private Scanner sc = new Scanner(System.in);
	private Calculatrice controller;
	
	public void afficher() {
		System.out.println("Entrez x : ");
		double x = sc.nextDouble();
		System.out.println("Entrez y : ");
		double y = sc.nextDouble();
		String operateur = "";
		do {
			System.out.println("Entrez l'opération : ");
			operateur = sc.next();
		} while (!verifierOperation(operateur));
		verifierOperation(operateur);
		controller.verifOperation(x, operateur, y);
		
	}
	
	public void afficherResultat(double res, double x, double y, String ope) {
		System.out.println(x+ope+y+" = "+res);
	}

	public Calculatrice getController() {
		return controller;
	}

	public void setControl(Calculatrice control) {
		this.controller = control;
	}
	
	public boolean verifierOperation(String ope) {
		ApplicationConfiguration config = new ApplicationConfiguration();
		if (!config.operationByChar.containsKey(ope)) {
			System.out.println("Cette opération n'est pas prise en charge");
			return false;
		}
		return true;
	}
	
//	public void verifierOperation(String ope) {
//		if(ope.indexOf('+') == -1 && ope.indexOf('-') == -1) {
//			System.out.println("Cette opération n'est pas prise en charge");
//			System.exit(0);
//		}
//	}

}
