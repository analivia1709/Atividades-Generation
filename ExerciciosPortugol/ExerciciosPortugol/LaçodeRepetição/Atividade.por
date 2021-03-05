programa
{
	
	funcao inicio()
	{
		inteiro variavelN

		escreva ("Por favor insira um numero: ")
		leia (variavelN)

		se (variavelN> 100) {
			escreva ("\nO numero é maior ou igual a 100! O numero é igual a" + variavelN + "")
		}
		senao se (variavelN == 100) {
			escreva ("\nEste numero eh o 100!")
		}
		senao {
			escreva ("\nNao é maior que 100. 0")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */