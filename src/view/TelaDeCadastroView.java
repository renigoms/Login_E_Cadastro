package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.BDController;
import Controller.MensagensController;
import Controller.UsuarioController;
import Model.MensagensModel;

@SuppressWarnings("serial")
public class TelaDeCadastroView extends Controller.TelaController{
	JButton cadastrarButton, sairButton;
	public JButton getCadastrarButton() {
		return cadastrarButton;
	}
	public JButton getSairButton() {
		return sairButton;
	}
	/**
	 * Tela de Cadastro 
	 * Filha da classe Tela
	 */
	public TelaDeCadastroView() {
		setTitle("Cadastrar");
//		BOTÃO CADASTRAR
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.addActionListener(new ActionListener() {
			
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (getLoginText().getText().equalsIgnoreCase("") || getPasswordText().getText().equalsIgnoreCase("")) {
					new MensagensController();
					MensagensController.exibirMensagemFalha();
					
				}
				UsuarioController usuario1 = new UsuarioController();
				usuario1.getUsuario().setLogin(getLoginText());
				usuario1.getUsuario().setSenha(getPasswordText());
				new BDController().salvarUsuario(usuario1);
				new MensagensController();
				MensagensController.exibirMensagemSucesso();
				setVisible(false);
				
				
				
				
				
				
			}
		});
//		BOTÃO SAIR
		sairButton = new JButton("Sair");
		sairButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
//		ADICIONAR À TELA 
		add(getCadastrarButton());
		add(getSairButton());
		setVisible(true);
	}
}

