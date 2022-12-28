package Controller;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class TelaController extends JFrame{
	private JLabel loginLabel, passwordLabel;
	private JTextField loginText;
	private JPasswordField passwordText;
	/**
	 * Classe mãe das telas Jframe.
	 */
	
	public TelaController() {
//		construção
		setSize(370,100);
		setLayout(new FlowLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		botões e afins
		
		loginLabel = new JLabel("Login");
		loginText = new JTextField(10);
		passwordLabel = new JLabel("Senha");
		passwordText = new JPasswordField(10);
		
		
//		adicionar
		
		add(loginLabel);
		add(loginText);
		add(passwordLabel);
		add(passwordText);
	}
}
