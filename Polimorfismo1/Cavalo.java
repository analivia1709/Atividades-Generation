package Polimorfismo1;

public class Cavalo extends Animal {

	private String Cordopelo;
	private String Ra�a;
	
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

	public String getRa�a() {
		return Ra�a;
	}

	public void setRa�a(String ra�a) {
		Ra�a = ra�a;
	}

}
