package Polimorfismo1;

public class Preguiça extends Animal {

	@Override
	public void EmitirSom() {
		System.out.println("hummm.hummm");
	}

	@Override
	public void Locomover() {
		System.out.println("Subir em arvores");
	}
	
	public void Comer() {
		System.out.println("Folhas e Frutos");
	}
}
