programa
{
	
	funcao inicio()
	{
		// Esse programa converte o numero de dias, meses e anos para o numero de dias totais.
		inteiro anos
		inteiro meses
		inteiro dias
		
		escreva ("\n Por favor insira, a quantidade de anos: ")
		leia (anos)

		escreva ("\n Por favor, insira a quantidade de meses: ")
		leia (meses)

		escreva ("\n Por ultimo, por favor, insira a quantidade de dias: ")
		leia (dias)

		inteiro anosEmDias = anos * 365
		inteiro mesesEmDias = meses * 30
		inteiro somaDeDias = anosEmDias + mesesEmDias + dias

		escreva ("\n O total de dias eh igual a " + somaDeDias)
		escreva ("\n Obrigado")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 608; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */