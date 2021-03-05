programa
{
	
	funcao inicio()
	{
		// Esse programa lê a quantidade de segundos e os conversão em horas, minutos e segundos
		inteiro segundos
		
		escreva ("Por favor insira, a quantidade de segundos \n")
		leia (segundos)

		inteiro horas = segundos / (60 * 60)
		inteiro restoPraMinutos = segundos% (60 * 60)
		inteiro minutos = restoPraMinutos / 60
		inteiro segundosDoEvento = restoPraMinutos% 60
		cadeia segundosPraFechar = "segundo (s)"

		escreva ("\nO evento irá durar " + horas + " hora (s), " + minutos + " minuto (s) e " + segundosDoEvento + segundosPraFechar)
		escreva ("\nBoa Sorte")
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */