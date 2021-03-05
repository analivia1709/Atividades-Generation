package herança;

import java.text.NumberFormat;

public class Fornecedor extends Pessoa {
	//ATRIBUTOS
	public int Cnpj;
	private float valorCredito;
	private float valorDivida;
	
	
		//METODO CONTRUTOR
	public Fornecedor (String Nome,String Endereço,int Numero,int cpf,float valorCredito, float valorDivida,int Cnpj) {
	super(Nome,Endereço,Numero,cpf);
	
	this.valorCredito = valorCredito;
	this.valorDivida = valorDivida;
	this.Cnpj=Cnpj;
	}
	 
	public Fornecedor() {
			super();
		}
	//METODOS
	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public int getCnpj() {
		return Cnpj;
	}


	public void setCnpj(int cnpj) {
		Cnpj = cnpj;
	}


	public String obterSaldo() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String saldo = nf.format(getValorCredito()-getValorDivida());
		return saldo;

}
	public void imprmirInfo() {
		
		System.out.println("Cnpj: "+Cnpj+"Valor do credito: "+valorCredito+"Valor da divida: "+valorDivida);
	}
}
