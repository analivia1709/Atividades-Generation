package PacoteJava;

import java.util.Scanner;

public class ExercicoValor {
	
	public static void main(String args[])
	{
		int a,b,c,soma;
		double r,s,d;
		Scanner leitura= new Scanner(System.in);
		
		System.out.printf("\nEntre com valor de A:");
		a=leitura.nextInt();
		System.out.printf("\nEntre com valor de B:");
		b=leitura.nextInt();
		System.out.printf("\nEntre com valor de C:");
		c=leitura.nextInt();
		r=Math.pow((a+b),2);
		s=Math.pow((b+c),2);
		d= (r+s) /2;
		System.out.printf("\nO valor de D foi: %2.2f",d);
	
	}

}
