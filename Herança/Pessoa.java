
package heran�a;

public class Pessoa {
	//colocar cpf e numero como String 
	//ATIBUTOS
	private String Nome;
	private String Endere�o;
	private int Numero;
	private int cpf;
	
	//CONSTRUTOR
	public Pessoa (String Nome,String Endere�o,int Numero,int cpf) {
		
		this.Nome=Nome;
		this.cpf=cpf;
		this.Endere�o=Endere�o;
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
	public String getEndere�o() {
		return Nome;
	}
	public void setEndere�o(String Endere�o) {
		this.Endere�o=Endere�o;
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
			
			System.out.println("\nNome: "+Nome+"\nEndere�o: "+Endere�o+"\nNumero: "+Numero+"Cpf: "+cpf);
			
		}
}


