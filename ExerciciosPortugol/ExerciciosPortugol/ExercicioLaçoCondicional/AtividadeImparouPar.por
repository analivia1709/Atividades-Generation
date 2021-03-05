programa
{
	
	funcao inicio()
	{
		inteiro numero
		
		escreva ("Posso verificar se um número eh positivo ou negativo, par ou impar.")
		escreva ("Por favor, digite um numero: ")
		leia (numero)

		se (numero% 2 == 0) {
			escreva ("\n" + numero + "eh um numero par")
		}
		senao {
			escreva ("\n" + numero + "eh um numero impar")
		}

		se (numero> 0) {
			escreva ("e positivo.")
		}
		senao se (numero == 0) {
			escreva ("e nulo.")
		}
		senao {
			escreva ("e negativo.")

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */