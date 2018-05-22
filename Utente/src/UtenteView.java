import java.awt.event.ActionListener;
import javax.swing.*;

public class UtenteView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton bottone_utente = new JButton("Username");
	private JTextField campo_di_testo_utente = new JTextField(10);
	
	public UtenteView() {
		
		JPanel UsernamePanel = new JPanel();
		this.setTitle("Applicazione");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,300);
		
		UsernamePanel.add(bottone_utente);
		UsernamePanel.add(campo_di_testo_utente);
		this.add(UsernamePanel);
	}
	
	void setUsername(String username) {
		campo_di_testo_utente.setText(username);
	}
	
	void addUsernameListener(ActionListener listenForbottone_utente){
		bottone_utente.addActionListener(listenForbottone_utente);
	}
	
}
