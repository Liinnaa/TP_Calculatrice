package Controllers;

import Views.View;
import Models.Operation;
import settings.OperationFactory;

public class Calculatrice {
	
	
	private View view;
	private Operation model;
	
	public Calculatrice(View interf) {
		super();
		this.view = interf;
	}

	public void verifOperation(double x, String ope, double y) {
		model = OperationFactory.initOperation(ope);
		
		view.afficherResultat(model.calculer(x,y), x, y, ope);
	}
	
	public View getView() {
		return view;
	}
	
	public void setInterf(View interf) {
		this.view = interf;
	}

}
