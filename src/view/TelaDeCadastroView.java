package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
		cadastrarButton = new JButton("Cadastrar");
		sairButton = new JButton("Sair");
		sairButton.addActionListener(new EventoAction());
		
		add(getCadastrarButton());
		add(getSairButton());
		setVisible(true);
	}
	
	public class EventoAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == getSairButton()){
				setVisible(false);
			}
			
		}}

}
