package Controller;

import Model.BancoDeDadosArrayListModel;

public class BDController {
	
	public void salvarUsuario(UsuarioController usuario) {
		new BancoDeDadosArrayListModel();
		BancoDeDadosArrayListModel.criarBase();
		BancoDeDadosArrayListModel.getUsuario().add(usuario);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void exibirInfo() {
		for(UsuarioController teste : BancoDeDadosArrayListModel.getUsuario()) {
			System.out.println(teste.getUsuario().getLogin().getText());
			System.out.println(teste.getUsuario().getSenha().getText());
		}
	}

	

}
