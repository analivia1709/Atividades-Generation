package Polimorfismo1;

public class Cachorro extends Animal {

	private String Ra�a;

	@Override
	public void EmitirSom() {
		System.out.println("Au..Au..Au");
	}

	@Override
	public void Locomover() {
		System.out.println("Correndo");
	}

	public String getRa�a() {
		return Ra�a;
	}

	public void setRa�a(String ra�a) {
		Ra�a = ra�a;
	}
}
