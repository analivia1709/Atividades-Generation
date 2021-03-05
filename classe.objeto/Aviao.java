package orientaçaoaobjetos;

public class Aviao {
	
	
	private int assentos;
	private String horadovoo;
	private int passagem;
	private String nomepassageiro;
	
	public Aviao(int assentos,String horadovoo,int passagem,String nomepassageiro) {
		
		this.assentos=assentos;
		this.horadovoo=horadovoo;
		this.passagem=passagem;
		this.nomepassageiro=nomepassageiro;	
	}
	public Aviao () {
		
	}
	public int getassentos() {
		return assentos;
	}
	
	public void setassentos(int assentos) {
		
		this.assentos= assentos;
	}
	public String gethoradovoo() {
		return horadovoo;
	}
	public void sethoradovoo(String horadovoo) {
		this.horadovoo=horadovoo;
	}
	public int getpassagem() {
		return passagem;
	}
	public void setpassagem(int passagem) {
		this.passagem=passagem;
	}
	public String getnomepassageiro() {
		return nomepassageiro;
	}
	public void setpassageiro(String nomepassageiro) {
		this.nomepassageiro=nomepassageiro;
	}	

	public void imprimirInfo() {	
		System.out.println("Numero de assentos: "+ assentos +"\nHorario do voo: " + horadovoo + "\nCodigo da passagem: "+ passagem + "\nNome do passageiro: "+ nomepassageiro);
	}

}
