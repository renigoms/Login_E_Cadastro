package view;

import javax.swing.JOptionPane;

import Model.MensagensModel;

public class MensagensView {
	/*
	 * Ver se o erro ta aqui
	 */
	public static void exibirMensagemSucesso() {
		
		JOptionPane.showMessageDialog(null, MensagensModel.getMensagemDeSucesso());
		
	}

	public static void exibirMensagemFalha() {
	
		JOptionPane.showMessageDialog(null, MensagensModel.getMensagemDeErro());
	
}
}
