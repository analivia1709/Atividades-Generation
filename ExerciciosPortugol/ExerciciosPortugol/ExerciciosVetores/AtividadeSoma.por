programa
{
	
	funcao inicio()
	{
		inteiro vetor [] = {1, 0, 5, -2, -5, 7} 
		inteiro somaDosVetores = vetor [0] + vetor [1] + vetor [5]

		escreva ("A soma da posicao 0, posicao 1 e posicao 5 eh igual a:" + somaDosVetores)

		para (inteiro posicao = 0; posicao <6; posicao ++) {
			escreva ("\nVetor posicao" + (posicao + 1) + ":" + vetor [posicao])
		}

		vetor [4] = 100
		
		para (inteiro posicao = 0; posicao <6; posicao ++) {
			escreva ("\nVetor posicao (valores expressos)" + (posicao + 1) + ":" + vetor [posicao])
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */