programa
{
	
	funcao inicio()
	{
		 real peso, excesso, multaTotal
		 real multa = 4,00
				
		escreva ("Saudações, senhor João. Lembre-se de que a cada quilo maior que 50 eh necessario pagar uma multa de" + multa + "0 reais. \n")
		escreva ("Por favor insira a quantidade de quilos de tomate: ")
		leia (peso)
		excesso = peso - 50

		se (excesso <= 0) {
			excesso = 0,00
			multaTotal = 0,00
			escrever ("\nA quantidade de excesso eh igual a" + excesso + "e a multa eh de" + multaTotal + "0 reais. \nObrigado!")
		}

		senao {
			multaTotal = excesso * multa
			escrever ("\nA quantidade de excesso eh igual a" + excesso + "e a multa eh de" + multaTotal + "0 reais. \nObrigado!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */