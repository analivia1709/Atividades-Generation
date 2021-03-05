programa
{
	
	funcao inicio()
	{
		// Esse programa lê a quantidade de dias vividos por alguem e devolve uma conversão em anos, meses e dias
		inteiro dias
		
		escreva ("Por favor insira a quantidade de dias \n")
		leia (dias)

		inteiro anos = dias / 365
		inteiro restoPraMeses = dias% 365
		inteiro meses = restoPraMeses / 30
		inteiro diasVividos = restoPraMeses% 30
		cadeia diasPraFechar = "dia (s)"

		escreva ("\n Voce viveu " + anos + " ano (s), " + meses + " mes (es) e " + diasVividos + diasPraFechar)
		escreva ("Parabens!")
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */