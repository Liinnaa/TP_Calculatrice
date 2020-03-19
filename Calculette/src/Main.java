import Controllers.Calculatrice;
import Views.View;

public class Main {

	public static void main(String[] args) {
		//VUE
		View view = new View();
	
		//controller
		Calculatrice controller = new Calculatrice(view);
		
		view.setControl(controller);
		view.afficher();
	}

}
