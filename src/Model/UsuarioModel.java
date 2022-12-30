package Model;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UsuarioModel {
	private JTextField login;
	private JPasswordField senha;
	public JTextField getLogin() {
		return login;
	}
	public void setLogin(JTextField login) {
		this.login = login;
	}
	public JPasswordField getSenha() {
		return senha;
	}
	public void setSenha(JPasswordField senha) {
		this.senha = senha;
	}
}
