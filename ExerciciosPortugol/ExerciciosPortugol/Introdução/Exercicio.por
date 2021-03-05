programa
{
	
	funcao inicio()
	{
		real a, b, c, d, E, f
		
		escreva ("\nPor favor, insira o valor de a: ")
		leia (a)
		escreva ("\nPor favor, insira o valor de b: ")
		leia (b)
		escreva ("\nPor favor, insira o valor de c: ")
		leia (c)
		escreva ("\nPor favor, insira o valor de d: ")
		leia (d)
		escreva ("\nPor favor, insira o valor de e: ")
		leia (E)
		escreva ("\nPor favor, insira o valor de f: ")
		leia (f)

		real  x = (c * E - b * f) / (a * E - b * d)
		real y  = (a * f - c * d) / (a * E - b * d) 

		escreva ("\nO valor de x é" + x)
		
		escreva ("\nO valor de y é" + y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */