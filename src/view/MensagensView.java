package view;

import javax.swing.JOptionPane;

import Model.MensagensModel;

public class MensagensView {
	
	public static void exibirMensagemSucesso() {
		
		JOptionPane.showMessageDialog(null, MensagensModel.getMensagemDeSucesso(), "Mensagem", 1);
		
	}

	public static void exibirMensagemFalha() {
	
		JOptionPane.showMessageDialog(null, MensagensModel.getMensagemDeErro(), "Mensagem", 0);
	
	}
	
	public static void exibirMensagemAoLogar() {
		JOptionPane.showMessageDialog(null, MensagensModel.getMensagemDeSucessoAoLogar(), "Mensagem", 1);
	}
	public static void exibirMensagemLoginSenhaIncorreto() {
		JOptionPane.showMessageDialog(null, MensagensModel.getMensagemDeErroDeSenhaloginIncorreto(), "Mensagem", 0);
	}
	
	
}
