programa
{
	
	funcao inicio()
	
		 real  indice
		 
		escreva ("Estou aqui para mantermos o mundo um lugar mais limpo. \nEm que indice de poluicao que estamos hoje?")
		leia (indice)

		se (indice <0,05) {
			escrever ("Incrivel! Estamos lutando por um mundo melhor!")
		}
		senao se (indice> = 0,05 e indice <0,25) {
			escreva ("Parabens, mantivemos os indices controlados hoje!")
		}
		senao se (indice> = 0,25 e indice <0,30) {
			escrever ("Cuidado, estamos chegando perto de outros alertas!")
		}
		senao se (indice> = 0,30 e indice <0,40) {
			escreva ("Industriam do tipo 1 precisam suspender as atividades!")
		}
		senao se (indice> = 0,40 e indice <0,50) {
			escrever ("Industriam do tipo 1 e 2 precisam suspender as atividades!")
		}
		senao {
			escreva ("Todas as industrias precisam suspender suas atividades!")
		}
		
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 44; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */