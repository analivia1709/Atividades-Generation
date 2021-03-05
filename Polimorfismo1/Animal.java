package Polimorfismo1;

public abstract class Animal {
	//atributos
	private String Nome;
	private int Idade;
	
	//metodos
	public abstract  void EmitirSom();
	public abstract void  Locomover();
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	
	

}
