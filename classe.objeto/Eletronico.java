package orientaçaoaobjetos;

public class Eletronico {
	
	public String marca;
	public String cor;
	public int valor;
	public String modelo;
	
	
	
	public Eletronico (String marca,String cor,int valor,String modelo) {
		
		this.marca=marca;
		this.cor=cor;
		this.valor=valor;
		this.modelo=modelo;	
	}
	public Eletronico() {
		
	}
	
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca=marca;
	}
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor=cor;
	}
	public int getvalor() {
		return valor;
	}
	public void setvalor(int valor) {
		this.valor=valor;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo=modelo;
	}
	public void imprimirInfo() {
		System.out.println("\nA marca do seu eletronico é "+ marca +"\nA cor do seu eletronico é "+cor+
				"\nO modelo do seu eletronico é "+modelo+"\nO valor do seu eletronico é R$" +valor);
	}
}
