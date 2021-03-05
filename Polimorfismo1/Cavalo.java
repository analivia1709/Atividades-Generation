package Polimorfismo1;

public class Cavalo extends Animal {

	private String Cordopelo;
	private String Raça;
	
	@Override
	public void EmitirSom() {
		System.out.print("iieerrrrr");
	}

	@Override
	public void Locomover() {
		System.out.println("Correndo");
	}

	public String getCordopelo() {
		return Cordopelo;
	}

	public void setCordopelo(String cordopelo) {
		Cordopelo = cordopelo;
	}

	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}

}
