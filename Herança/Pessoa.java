
package herança;

public class Pessoa {
	//colocar cpf e numero como String 
	//ATIBUTOS
	private String Nome;
	private String Endereço;
	private int Numero;
	private int cpf;
	
	//CONSTRUTOR
	public Pessoa (String Nome,String Endereço,int Numero,int cpf) {
		
		this.Nome=Nome;
		this.cpf=cpf;
		this.Endereço=Endereço;
		this.Numero=Numero;
			
	}
	
	public Pessoa() {
		super();
	}


	//METODOS
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome=Nome;
	}
	public String getEndereço() {
		return Nome;
	}
	public void setEndereço(String Endereço) {
		this.Endereço=Endereço;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int Numero) {
		this.Numero=Numero;
	}
	public int getcpf() {
		return cpf;
	}
	public void setcpf(int cpf) {
		this.cpf=cpf;
	}
		public void imprmirInfo() {
			
			System.out.println("\nNome: "+Nome+"\nEndereço: "+Endereço+"\nNumero: "+Numero+"Cpf: "+cpf);
			
		}
}


