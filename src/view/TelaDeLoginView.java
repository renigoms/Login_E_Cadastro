package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.BDController;
import Controller.UsuarioController;


@SuppressWarnings("serial")
public class TelaDeLoginView extends Controller.TelaController{
	JButton entrarButton, sairButton;
	UsuarioController usuario1;
	/**
	 * Tela de Login.
	 * Filha da classe Tela.
	 */
	public TelaDeLoginView() {
		setTitle("Login");
//		BOTÃO ENTRAR
		entrarButton = new JButton("Entrar");
		entrarButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getLoginText().getText().equalsIgnoreCase("") || getPasswordText().getText().equalsIgnoreCase("")){
					MensagensView.exibirMensagemFalha();;	
				}else {
					usuario1 = new UsuarioController(getLoginText(), getPasswordText());
					new BDController();
					if(BDController.buscarUsuario(usuario1)) {
						MensagensView.exibirMensagemAoLogar();;
					}else {
						MensagensView.exibirMensagemLoginSenhaIncorreto();;
					}
					
					setVisible(false);
				}
				
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
//		ADICIONAR A TELA
		add(getEntrarButton());
		add(getSairButton());
		setVisible(true);
	}
	public JButton getSairButton() {
		return sairButton;
	}
	public JButton getEntrarButton() {
		return entrarButton;
	}
	
}
