programa
{
	
	funcao inicio()
	{
		inteiro idade = 0
		inteiro genero = 0
		inteiro pessoas= 0
		inteiro comportamento= 0
		inteiro calmosGeral = 0
		inteiro nervosasMulheres = 0
		inteiro agressivosHomens = 0
		inteiro calmosOutros = 0
		inteiro nervososQuarenta = 0
		inteiro calmosAdolescentes = 0

		escreva ("Posso ler os dados de comportamento de até 150 pessoas. ")
		enquanto (pessoas <= 150) {
			
			escreva ("Por favor insira a idade: ")
			leia (idade)
			escreva ("Por favor, qual seu genero? (1 - Feminino / 2 - Masculino / 3 - Outros) ")
			leia (genero)
			escreva ("Como você estah se sentindo? (1 - Calmo (a) / 2 - Nervoso (a) / 3 - Agressivos) ")
			leia (comportamento)

			se (comportamento == 3) {
				calmosGeral ++
			}
			se (genero == 1 e comportamento == 2) {
				nervosasMulheres ++
			}
			se (genero == 2 e comportamento == 3) {
				agressivosHomens ++
			}
			se (genero == 3 e comportamento == 1) {
				calmosOutros ++
			}
			se (idade> 40 e comportamento == 2) {
				nervososQuarenta ++
			}
			se (idade <18 e comportamento == 1) {
				calmosAdolescentes ++
			}
			pessoas ++
		}
	
		escreva ("Dados coletados. \n" +
		"O numero de pessoas calmas eh:" + calmosGeral + "." +
		"O numero de mulheres nervosas eh:" + nervosasMulheres + "." +
		"O numero de homens agressivos eh:" + agressivosHomens + "." +
		"O numeros de outros calmos eh:" + calmosOutros + "." +
		"O numero de pessoas maiores de 40 anos calmos eh:" + nervososQuarenta + "." +
		"O numero de menores de 18 anos calmos eh:" + calmosAdolescentes + "." +
		"Obrigado!")
		
	}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */