
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	private int teste = 15;
	private int valor = 4;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}


}
