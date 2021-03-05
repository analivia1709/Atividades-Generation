package Polimorfismo1;

public class Cachorro extends Animal {

	private String Raça;

	@Override
	public void EmitirSom() {
		System.out.println("Au..Au..Au");
	}

	@Override
	public void Locomover() {
		System.out.println("Correndo");
	}

	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}
}
