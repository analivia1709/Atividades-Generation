programa
{
	
	funcao inicio()
	{
	     real matriz [2] [2]
		real matriz2 [2] [2]
		real matriz3 [2] [2]
		real constante 
		inteiro opcao
		
		para (inteiro posicaoX = 0; posicaoX <2; posicaoX ++) {
			
			para (inteiro posicaoY = 0; posicaoY <2; posicaoY ++) {
				escreva ("Digite o valor da Matriz A [" + posicaoX + "] [" + posicaoY + "] \n")
				leia (matriz [posicaoX] [posicaoY])
			}
		}

		para (inteiro posicaoX = 0; posicaoX <2; posicaoX ++) {
			
			para (inteiro posicaoY = 0; posicaoY <2; posicaoY ++) {
				escreva ("Digite o valor da Matriz B [" + posicaoX + "] [" + posicaoY + "] \n")
				leia (matriz2 [posicaoX] [posicaoY])
			}
		}

		escreva ("Qual operacao voce deseja realizar? \n 1 - Soma entre as matrizes \n 2 - Diferenca de B por A \n 3 - Adicionar constante \n 4 - Imprimir como matrizes \n")
		leia (opcao)
		se (opcao == 1) {
				para (inteiro posicaoX = 0; posicaoX <2; posicaoX ++) {
			
					para (inteiro posicaoY = 0; posicaoY <2; posicaoY ++) {
						matriz3 [posicaoX] [posicaoY] = matriz [posicaoX] [posicaoY] + matriz2 [posicaoX] [posicaoY]
						escreva ("Matriz C [" + posicaoX + "] [" + posicaoY + "] =" + matriz3 [posicaoX] [posicaoY] + "\n")
					}
				}
		}
		se (opcao == 2) {
			para (inteiro posicaoX = 0; posicaoX <2; posicaoX ++) {
			
					para (inteiro posicaoY = 0; posicaoY <2; posicaoY ++) {
						matriz3 [posicaoX] [posicaoY] = matriz2 [posicaoX] [posicaoY] - matriz [posicaoX] [posicaoY]
						escreva ("Matriz C [" + posicaoX + "] [" + posicaoY + "] =" + matriz3 [posicaoX] [posicaoY] + "\n")
					}
				}
		}
		se (opcao == 3) {
			escreva ("Por favor insira o valor dessa constante \n")
			leia (constante)
			para (inteiro posicaoX = 0; posicaoX <2; posicaoX ++) {
			
					para (inteiro posicaoY = 0; posicaoY <2; posicaoY ++) {
						
						matriz [posicaoX] [posicaoY] = matriz [posicaoX] [posicaoY] + constante
						escreva ("Matriz A [" + posicaoX + "] [" + posicaoY + "] =" + matriz [posicaoX] [posicaoY] + "\n")
					}
			}
			para (inteiro posicaoX = 0; posicaoX <2; posicaoX ++) {
			
					para (inteiro posicaoY = 0; posicaoY <2; posicaoY ++) {
						
						matriz2 [posicaoX] [posicaoY] = matriz2 [posicaoX] [posicaoY] + constante
						escreva ("Matriz B [" + posicaoX + "] [" + posicaoY + "] =" + matriz2 [posicaoX] [posicaoY] + "\n")
					}
			}
			
		}
		se (opcao == 4) {
				para (inteiro posicaoX = 0; posicaoX <2; posicaoX ++) {
			
					para (inteiro posicaoY = 0; posicaoY <2; posicaoY ++) {
						escreva ("Matriz A [" + posicaoX + "] [" + posicaoY + "] =" + matriz [posicaoX] [posicaoY] + "\n")
					}
				}
				para (inteiro posicaoX = 0; posicaoX <2; posicaoX ++) {
			
					para (inteiro posicaoY = 0; posicaoY <2; posicaoY ++) {
						escreva ("Matriz B [" + posicaoX + "] [" + posicaoY + "] =" + matriz2 [posicaoX] [posicaoY] + "\n")
					}
				}
		}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */