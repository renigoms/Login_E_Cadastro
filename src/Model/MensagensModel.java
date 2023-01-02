package Model;

public class MensagensModel {
	/*
	 * ver se esta aqui o erro.
	 */
	private static final String MENSAGEM_DE_SUCESSO = "Operação bem sucedida.";
	private static final String MENSAGEM_DE_ERRO = "Ocorreu um imprevisto.";
	
	public static String getMensagemDeSucesso() {
		return MENSAGEM_DE_SUCESSO;
	}
	public static String getMensagemDeErro() {
		return MENSAGEM_DE_ERRO;
	}
}
