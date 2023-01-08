package Controller;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.UsuarioModel;


public class UsuarioController {
	
	private UsuarioModel usuario;
	
	public UsuarioController(JTextField login, JPasswordField senha) {
		setUsuario(new UsuarioModel(login,senha));
	}
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
}
