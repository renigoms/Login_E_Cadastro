package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.BDController;
import Controller.UsuarioController;

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
				System.out.println("Vamos ver o que deu com essa merda.");
				System.out.println("E la vamos nois");
				if (getLoginText().getText().equalsIgnoreCase("") || getPasswordText().getText().equalsIgnoreCase("")) {
					System.out.println("Deu certo");
					
				}
				UsuarioController usuario1 = new UsuarioController();
				usuario1.getUsuario().setLogin(getLoginText());
				usuario1.getUsuario().setSenha(getPasswordText());
				new BDController().salvarUsuario(usuario1);
				
				
				
				
				
				
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

