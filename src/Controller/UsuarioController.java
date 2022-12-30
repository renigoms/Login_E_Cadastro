package Controller;

import Model.UsuarioModel;


public class UsuarioController {
	
	private UsuarioModel usuario;
	
	public UsuarioController() {
		setUsuario(new UsuarioModel());
	}
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
}
