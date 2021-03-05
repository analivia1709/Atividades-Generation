programa
{
	
	funcao inicio()
	{
		escreva ("Todos os numeros maiores que 1000 que divididos por 11 tem o resto de 5: \n")
		para (inteiro divisor = 1000; divisor <1999; divisor ++) {
			se (divisor% 11 == 5)
			escreva (divisor + "\n")
		}
		escreva ("Obrigado!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */