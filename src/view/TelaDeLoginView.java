package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class TelaDeLoginView extends Controller.TelaController{
	JButton entrarButton, sairButton;
	/**
	 * Tela de Login.
	 * Filha da classe Tela.
	 */
	public TelaDeLoginView() {
		setTitle("Login");
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		sairButton.addActionListener(new EventoAction());
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
	
	public class EventoAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== getSairButton()) {
				setVisible(false);
			}
			
		}}
}
