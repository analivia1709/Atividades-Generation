
package heranša;

public class Pessoa {
	//colocar cpf e numero como String 
	//ATIBUTOS
	private String Nome;
	private String Enderešo;
	private int Numero;
	private int cpf;
	
	//CONSTRUTOR
	public Pessoa (String Nome,String Enderešo,int Numero,int cpf) {
		
		this.Nome=Nome;
		this.cpf=cpf;
		this.Enderešo=Enderešo;
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
	public String getEnderešo() {
		return Nome;
	}
	public void setEnderešo(String Enderešo) {
		this.Enderešo=Enderešo;
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
			
			System.out.println("\nNome: "+Nome+"\nEnderešo: "+Enderešo+"\nNumero: "+Numero+"Cpf: "+cpf);
			
		}
}


