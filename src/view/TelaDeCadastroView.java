package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Model.UsuarioModel;

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
				UsuarioModel usuario1 = new UsuarioModel();
				usuario1.setLogin(getLoginText());
				usuario1.setSenha(getPasswordText());
				JOptionPane.showMessageDialog(null, usuario1.getLogin());
				JOptionPane.showMessageDialog(null, usuario1.getSenha());
				
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

