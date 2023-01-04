package Model;

public class MensagensModel {
	
	private static final String MENSAGEM_DE_SUCESSO_AO_LOGAR = "Login efetuado com sucesso, Bem vindo "
			+ "ao sistema.";
	private static final String MENSAGEM_DE_SUCESSO = "Usuário cadastrado com sucesso.";
	private static final String MENSAGEM_DE_ERRO = "Existem campos não preechidos.";
private static final String MENSAGEM_DE_ERRO_DE_SENHALOGIN_INCORRETO = "Login ou Senha incorreta.";
	
	public static String getMensagemDeSucesso() {
		return MENSAGEM_DE_SUCESSO;
	}
	public static String getMensagemDeErro() {
		return MENSAGEM_DE_ERRO;
	}
	public static String getMensagemDeSucessoAoLogar() {
		return MENSAGEM_DE_SUCESSO_AO_LOGAR;
	}
	public static String getMensagemDeErroDeSenhaloginIncorreto() {
		return MENSAGEM_DE_ERRO_DE_SENHALOGIN_INCORRETO;
	}
}
