programa
{
	
	funcao inicio()
	{
		inteiro numero = 0
		inteiro multiplos  = 0
	     inteiro divisor = 0
		inteiro  media= 0
		escreva ("Posso fazer uma mídia de multiplos de 3 para voce. \nDigite os numeros below. Para terminar, digite 0. \n")
		
		faca {
			leia (numero)
			se (numero% 3 == 0 e numero> 0) {
			multiplos = multiplos + numero
			divisor ++
			}
		} enquanto (numero!= 0)
		media = multiplos / divisor
		
		escreva ("A media de todos os multiplos de 3 inseridos eh:" + media + ". \nObrigado!")
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 523; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */