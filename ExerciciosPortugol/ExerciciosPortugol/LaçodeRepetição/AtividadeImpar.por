programa
{
	
	funcao inicio()
	{
		inteiro numero = 0
		inteiro pares = 0
		inteiro impares = 0
		inteiro concede = 0
		
		escreva ("Posso verificar se 10 numeros sao pares ou impares \n")
		escreva ("Por favor insira, o 1 ° numero: \n")
		para (inteiro i = 0; i <10; i ++) {
			leia (numero)
			se (i <9) {
				escreva ("inserir o" + (i + 2) + "º numero \n")
			}
			se (numero% 2 == 0) {
				pares ++
			}
			senao {
				concede ++
			}
			
		}
		escreva ("A quantidade de numeros pares eh:" + pares + 
		"\nE a quantidade de numeros de impares eh:" + impares + "\nObrigado!")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */