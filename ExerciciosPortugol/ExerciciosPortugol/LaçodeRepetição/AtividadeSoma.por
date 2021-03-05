programa
{
	
	funcao inicio()
	{
		inteiro numero = 1
		inteiro soma = 0
		
		escreva ("Por favor insira um numero: \n")

		faca {
			leia (numero)
			se (numero!= 0) {
				escreva ("Ainda nao eh um zero. Por favor, insira um novo numero. \n")
			}
			soma = soma + numero
		} enquanto (numero!= 0)
		escreva ("\nA soma dos numeros eh igual a:" + soma + "\nObrigado!")
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */