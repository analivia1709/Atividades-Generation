package orienta�aoaobjetos;

public class Cliente {
	
	private String Nome;
	private String cpf;
	private String endere�o;
	private int idade;

	public Cliente() {
	}

	public Cliente(String Nome, String cpf, String endere�o, int idade) {

		this.Nome = Nome;
		this.cpf = cpf;
		this.endere�o = endere�o;
		this.idade = idade;

	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public int getidade() {
		return idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public String getendere�o() {
		return endere�o;
	}

	public void setendere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public boolean validaCpf() {
		if (this.getcpf().length() < 11 || this.getcpf().length() > 11) {
			return false;
		} else {
			return true;
		}
	}

	public void maiordeidade() {
		if (idade >= 18) {

			System.out.println("Acesso liberado vo� � maior de idade ");
		}

		else {

			System.out.println("Acesso negado,infelizmente voc� ainda � menor de idade ");
		}
			
	}
	
	public void imprimirInfo() {
		
		System.out.println("\nNome: "+ Nome +"\nCPF: "+cpf+"\nIdade: "+idade+"\nEndere�o: "+ endere�o +"\n");
		
	}
}
