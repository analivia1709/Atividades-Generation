package PacoteJava;

import java.util.Scanner;

public class ExercicioNota {

	public static void main(String args[])
	{
		int nota1 , nota2, nota3;
		float notas,media,aluno,soma, mediaAluno;
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Por favor, insira a primeira nota: ");
		nota1=leia.nextInt();
		System.out.println("Por favor, insira a segunda nota: ");
		nota2=leia.nextInt();
		System.out.println("Por favor, insira a terceira nota: ");
		nota3=leia.nextInt();
				
		soma= nota1 + nota2 + nota3;
		
		media=soma/3;
		System.out.printf("\nSua média é:%f",media);
		mediaAluno=leia.nextInt();
				
	}
}
