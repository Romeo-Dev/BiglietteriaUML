
public class Test {

	public static void main(String args[]) { 
		
		UtenteView view1 = new UtenteView();
		UtenteModel model1 = new UtenteModel();
		UtenteController controller1 = new UtenteController(view1, model1);
		view1.setVisible(true);
	}
}
