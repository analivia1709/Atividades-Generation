package orientaçaoaobjetos;

public class Cliente {
	
	private String Nome;
	private String cpf;
	private String endereço;
	private int idade;

	public Cliente() {
	}

	public Cliente(String Nome, String cpf, String endereço, int idade) {

		this.Nome = Nome;
		this.cpf = cpf;
		this.endereço = endereço;
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

	public String getendereço() {
		return endereço;
	}

	public void setendereço(String endereço) {
		this.endereço = endereço;
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

			System.out.println("Acesso liberado voê é maior de idade ");
		}

		else {

			System.out.println("Acesso negado,infelizmente você ainda é menor de idade ");
		}
			
	}
	
	public void imprimirInfo() {
		
		System.out.println("\nNome: "+ Nome +"\nCPF: "+cpf+"\nIdade: "+idade+"\nEndereço: "+ endereço +"\n");
		
	}
}
