package Model;

import java.util.ArrayList;

import Controller.UsuarioController;

public class BancoDeDadosArrayListModel {
	
	private static ArrayList<UsuarioController> usuario;
	
	public static void criarBase() {
		setUsuario(usuario = new ArrayList<>());
	}

	public static ArrayList<UsuarioController> getUsuario() {
		return usuario;
	}

	public static void setUsuario(ArrayList<UsuarioController> usuario) {
		BancoDeDadosArrayListModel.usuario = usuario;
	}

}
