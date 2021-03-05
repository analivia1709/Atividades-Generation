package ExerciciosIf;

import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {

		int num=1,cont=0;
		float media=0, soma=0;
		
		Scanner ler = new Scanner (System.in);
	
		while(num!=0){
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
		}
		
		if(num%3==0) {
			cont++;
			soma= soma + 1;
			
			media= soma/cont;
			
		}
		System.out.println("A soma dos multiplos de 3 ," + soma + " e a media foi "+ media);
	}
}
