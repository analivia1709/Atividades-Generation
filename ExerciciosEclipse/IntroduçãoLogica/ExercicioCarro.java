package PacoteJava;

import java.util.Scanner;

public class ExercicioCarro {

	public static void main(String args[])
	{
		float custoFabrica;
		double custoConsumidor, imp,distribuidor,  percentagemIm=0.45,  percentagemDis=0.28;
		Scanner leia=new Scanner(System.in);
		
		System.out.printf("\nDigite o custo de fábrica:");
		custoFabrica=leia.nextInt();
		distribuidor=(custoFabrica*percentagemDis);
		imp=(custoFabrica*percentagemIm);
		custoConsumidor=(custoFabrica+distribuidor+imp);
		System.out.printf("\n O custo do carro ao consumidor é de: %2.2f",custoConsumidor);
	}
}
