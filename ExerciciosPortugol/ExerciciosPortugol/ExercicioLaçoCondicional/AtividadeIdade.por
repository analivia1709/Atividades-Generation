programa
{
	
	funcao inicio()
	{
		   inteiro idade
              inteiro op
              
		    escreva("Digite a sua idade: ")
		    
		    escreva("\n1) 5 a 7 anos \n2) 8 a 11 anos \n3) 12 a 13 anos \n4) 14 a 17 anos  \n5) Mais de  18 anos : " )
		    leia(idade)
		    escreva("\nEscolha uma das opção: ")
		    leia(op)
		    

              
		    escolha(op)
		    {
		    caso 1:
		    escreva("\nVoce faz parte da piscina infantil: ")
		    
		   // idade : =>5 e =<7
		    pare
		    caso 2:
		     escreva("\nVoce faz parte da piscina infantil 2: ")
		    //idade : =>8 e =<11
		    pare
		    caso 3:
		     escreva("\nVoce faz parte da piscina juvenil: ")
		    //idade : =>12 e =<13
		    pare
		    caso 4:
		     escreva("\nVoce faz parte da piscina juvenil2: ")
		    //idade : =>14 e =<17
		    pare
		    caso 5:
		     escreva("\nVoce faz parte da piscina dos Adultos: ")
		    //idade : =>18
		     pare
		     
		     caso contrario:
		     escreva("\nSinto muito, mas , infelizmente você nao podera nadar em nossas piscinas")
		    }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 932; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */