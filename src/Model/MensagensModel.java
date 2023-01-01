package Model;

public class MensagensModel {
	private static final String MENSAGEM_DE_EXITO = "Operação realizada com sucesso.";
	private static final String MENSAGEM_DE_ERRO = "Erro no processo, repita-o";
	
	public static String getMensagemDeExito() {
		return MENSAGEM_DE_EXITO;
	}
	public static String getMensagemDeErro() {
		return MENSAGEM_DE_ERRO;
	}
	
	
}
