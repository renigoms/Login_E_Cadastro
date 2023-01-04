package Controller;

import Model.BancoDeDadosArrayListModel;



public class BDController {
	
	public static void abrirBase() {
		BancoDeDadosArrayListModel.criarBase();
	}

	
	public static void salvarUsuario(UsuarioController usuario) {
		BancoDeDadosArrayListModel.getUsuario().add(usuario);
		
	}
	
	@SuppressWarnings("deprecation")
	public static boolean buscarUsuario(UsuarioController usuario1){
		for (UsuarioController userCadas : BancoDeDadosArrayListModel.getUsuario()) {
			if (userCadas.getUsuario().getLogin().getText().equalsIgnoreCase(usuario1.getUsuario().getLogin().getText())&&
					userCadas.getUsuario().getSenha().getText().equalsIgnoreCase(usuario1.getUsuario().getSenha().getText())) {
				return true;
			}
		}
		
		return false;
	}
	
	@SuppressWarnings("deprecation")
	public static void exibirInfo() {
		for(UsuarioController teste : BancoDeDadosArrayListModel.getUsuario()) {
			System.out.println(teste.getUsuario().getLogin().getText());
			System.out.println(teste.getUsuario().getSenha().getText());
		}
	}

	

}
