package Controller;

import javax.swing.JOptionPane;

import Model.MensagensModel;

public class MensagemController {
	
	public static void exibirMensagemSucesso() {
			
			JOptionPane.showMessageDialog(null, MensagensModel.getMensagemDeExito());
			
		}
	
	public static void exibirMensagemFalha() {
		
		JOptionPane.showMessageDialog(null, MensagensModel.getMensagemDeErro());
		
	}

}
