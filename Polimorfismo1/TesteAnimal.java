package Polimorfismo1;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		Cachorro cachorro= new Cachorro();
		Cavalo cavalo= new Cavalo();
		Pregui�a pregui�a= new Pregui�a();
		
		System.out.println("**********FICHA Cachorro**********");

		System.out.println("Digite o nome do seu Cachorro: ");
		cachorro.setNome(ler.next());
		System.out.println(cachorro.getNome());
		
		System.out.println("Digite a idade do seu Cachorro: ");
		cachorro.setIdade(ler.nextInt());
		System.out.println(cachorro.getIdade());
		
		System.out.println("Digite a ra�a do seu cachorro:");
		cachorro.setRa�a(ler.next());
		System.out.println(cachorro.getRa�a());	
		cachorro.EmitirSom();
		cachorro.Locomover();
		System.out.println("**********FICHA Cachorro encerrada**********");
		
		System.out.println("**********FICHA Cavalo**********");

		System.out.println("Digite o nome do seu cavalo: ");
		cavalo.setNome(ler.next());
		System.out.println(cavalo.getNome());
		
		System.out.println("Digite a idade do seu cavalo: ");
		cavalo.setIdade(ler.nextInt());
		System.out.println(cavalo.getIdade());
		
		System.out.println("Digite a ra�a do seu cavalo: ");
		cavalo.setRa�a(ler.next());
		System.out.println(cavalo.getRa�a());
		
		System.out.println("Digte a cor do pelo do seu cavalo");
		cavalo.setCordopelo(ler.next());
		System.out.println(cavalo.getCordopelo());
		cavalo.EmitirSom();
		cavalo.Locomover();
		System.out.println("**********FICHA Cavalo encerrada**********");
		
		System.out.println("**********FICHA Pregui�a**********");

		System.out.println("Digite o nome da pregui�a: ");
		pregui�a.setNome(ler.next());
		System.out.println(pregui�a.getIdade());
		System.out.println("Digite a idade da pregui�a: ");
		pregui�a.setIdade(ler.nextInt());
		System.out.println(pregui�a.getIdade());
		pregui�a.EmitirSom();
		pregui�a.Locomover();
		System.out.println("**********FICHA Pregui�a encerrado**********");


	}

}
