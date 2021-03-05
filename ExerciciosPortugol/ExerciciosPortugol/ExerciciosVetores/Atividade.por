programa
{
	
	funcao inicio()
	{
		inteiro matriz3x3 [3] [3]
	     inteiro quantidadeDeMaiores = 0
		escreva ("Consigo contar, numa matriz 3 por 3, quantos numeros estao acima de 10! \n")
		escreva ("Por favor insira um numero: \n")

		para (inteiro posicaoX = 0; posicaoX <3; posicaoX ++) {
			
			para (inteiro posicaoY = 0; posicaoY <3; posicaoY ++) {
				se (posicaoX!= 3 e posicaoY!= 3)
				escreva ("Digite o proximo numero: \n")
				leia (matriz3x3 [posicaoX] [posicaoY])
				se (matriz3x3 [posicaoX] [posicaoY]> 10) {
					quantidadeDeMaiores ++
				}
			}
		}
		
		escreva ("A quantidade de maiores de 10 eh:" + quantidadeDeMaiores)
	}
}

	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 654; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */