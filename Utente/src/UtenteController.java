import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class UtenteController {

	private UtenteView theView;
	private UtenteModel theModel;
	
	public UtenteController(UtenteView theView, UtenteModel theModel) {
		
		this.theView = theView;
		this.theModel = theModel;
		// classe che gestisce le azioni listener 
		this.theView.addUsernameListener(new UsernameListener());
	}
	
	class UsernameListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			try {
				new UtenteDao();
				theModel.setNomeModelDto();
				theView.setUsername(theModel.getNome());
			}
			catch (SQLException e1) {
				e1.printStackTrace();
			}
		}			
	}
}
