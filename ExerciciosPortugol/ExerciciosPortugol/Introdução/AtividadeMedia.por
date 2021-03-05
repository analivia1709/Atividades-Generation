programa
{
	
	funcao inicio()
	{
		 real nota1 ,nota2, nota3,mediaPonderada
		
		escreva ("Ola. Por favor, insira a primeira nota: ")
		leia (nota1)

		escreva ("\nAgora, por favor, insira uma segunda nota: ")
		leia (nota2)

		escreva ("\nPor ultimo, por favor, insira a terceira nota: ")
		leia (nota3)

		mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10

		escreva ("\nA sua media ponderada foi:" + mediaPonderada)
		
		se (mediaPonderada> 5)
		escreva ("\nParabens! Voce passou ")
		
		senao
		escreva ("\nVoce esta em recuperação ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */