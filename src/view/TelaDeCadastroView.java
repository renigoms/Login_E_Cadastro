package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.BDController;
import Controller.UsuarioController;

@SuppressWarnings("serial")
public class TelaDeCadastroView extends Controller.TelaController{
	private JButton cadastrarButton, sairButton;
	private UsuarioController usuario1;
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
			
		
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (getLoginText().getText().equalsIgnoreCase("") || getPasswordText().getText().equalsIgnoreCase("")) {
					new MensagensView();
					MensagensView.exibirMensagemFalha();
					
				}else {
					usuario1 = new UsuarioController(getLoginText(),getPasswordText());
					BDController.salvarUsuario(usuario1);
					new MensagensView();
					MensagensView.exibirMensagemSucesso();
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
//		ADICIONAR À TELA 
		add(getCadastrarButton());
		add(getSairButton());
		setVisible(true);
		
	}
}

