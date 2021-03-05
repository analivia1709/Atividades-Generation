package Polimorfismo1;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		Cachorro cachorro= new Cachorro();
		Cavalo cavalo= new Cavalo();
		Preguiça preguiça= new Preguiça();
		
		System.out.println("**********FICHA Cachorro**********");

		System.out.println("Digite o nome do seu Cachorro: ");
		cachorro.setNome(ler.next());
		System.out.println(cachorro.getNome());
		
		System.out.println("Digite a idade do seu Cachorro: ");
		cachorro.setIdade(ler.nextInt());
		System.out.println(cachorro.getIdade());
		
		System.out.println("Digite a raça do seu cachorro:");
		cachorro.setRaça(ler.next());
		System.out.println(cachorro.getRaça());	
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
		
		System.out.println("Digite a raça do seu cavalo: ");
		cavalo.setRaça(ler.next());
		System.out.println(cavalo.getRaça());
		
		System.out.println("Digte a cor do pelo do seu cavalo");
		cavalo.setCordopelo(ler.next());
		System.out.println(cavalo.getCordopelo());
		cavalo.EmitirSom();
		cavalo.Locomover();
		System.out.println("**********FICHA Cavalo encerrada**********");
		
		System.out.println("**********FICHA Preguiça**********");

		System.out.println("Digite o nome da preguiça: ");
		preguiça.setNome(ler.next());
		System.out.println(preguiça.getIdade());
		System.out.println("Digite a idade da preguiça: ");
		preguiça.setIdade(ler.nextInt());
		System.out.println(preguiça.getIdade());
		preguiça.EmitirSom();
		preguiça.Locomover();
		System.out.println("**********FICHA Preguiça encerrado**********");


	}

}
