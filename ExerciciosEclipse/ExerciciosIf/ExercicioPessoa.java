package ExerciciosIf;

import java.util.Scanner;

public class ExercicioPessoa {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		int idade,op,es,pe=0,npc=0,nmn=0,nha=0,noc=0;
		int pv=0,pn=0;

		while(pe<=3){
		pe++;
		System.out.println("Digite sua idade:");
		idade = ler.nextInt();
		
		System.out.println("Esolha uma opção de genero: ");
		
		System.out.println("\n1)Sexo Feminino\n2)Sexo Masculino\n3)Outros");
		op = ler.nextInt();
		
		System.out.println("Escolha uma opção: ");
		System.out.println("\n1)Calma\n2)Nervosa\n3)Agressiva ");
		es = ler.nextInt();
			
		if(es==1) {
			
			npc++;
		}
		
		if(op==1  && es==2) {
			
			nmn++;
			
		}
		
		if(op==2 && es==3) {
			
			nha++;
			
		}
			if(op==3 && es==1) {
				
				noc++;
			}
			 if(idade>40 && es==2) {
				 
				 
				 pv++;
			 }
			 if(idade<18 && es==1) {
				 
				 pn++;
			 }
		}
			 
			 System.out.println("O numero de pessoas calmas é: "+ npc);
			 System.out.println("O numero de mulheres nervosas  é: "+ nmn);
			 System.out.println("O numero de homens nervosos é : "+ nha);
			 System.out.println("O numero de outros calmas é: "+ noc);
			 System.out.println("O numero de pessoas velhas nervosas é : "+ pv);
			 System.out.println("O numero de pessoas novas calmas é : "+ pn);
	 
	}
	
}

