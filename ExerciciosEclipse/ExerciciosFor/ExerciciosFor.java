package AtividadesGeneration;

import java.util.Scanner;

public class ExerciciosFor {
	
	public static void main(String[] args) {

		 int x,r;
		 Scanner ler = new Scanner (System.in);
		 
		 for(x=1000;x<1999;x++) {
			 
			 r= (x%11);
			if(r==5); {
				
				System.out.println(" \nNo numero "+ x +  " obeteremos o resto " + r);
			}
					 
}
}
}