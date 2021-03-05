package herança;

import java.util.Scanner;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	Fornecedor fornecedor = new Fornecedor() ;

		
	 System.out.print("Digite o nome do fornecedor: ");
	 fornecedor.setNome(ler.next());
	 System.out.println(fornecedor.getNome());
	 
	 
	 System.out.println("Digite o cnpj do Fornecedor: ");
	 fornecedor.setCnpj(ler.nextInt());
	 System.out.println(fornecedor.getCnpj());
	 
	 System.out.print("Digite o endereço do Fornecedor: ");
	 fornecedor.setEndereço(ler.next());
	 System.out.println(fornecedor.getEndereço());
	 
	 System.out.println("Digite o telefone de contato do Fornecedor:");
	 fornecedor.setNumero(ler.nextInt());
	 System.out.println(fornecedor.getNumero());
	 
	 System.out.println("Digite o valor de crédito com Fornecedor: R$");
	 fornecedor.setValorCredito(ler.nextFloat());
	 System.out.println( fornecedor.getValorCredito());
	 
	 System.out.println("Digite o valor de dívidas com Fornecedor: -R$");
	 fornecedor.setValorDivida(ler.nextFloat());
	 System.out.println(fornecedor.getValorDivida());
	 
	 System.out.println("O valor do seu saldo é R$ "+fornecedor.obterSaldo(null));
	 fornecedor.obterSaldo(ler.next());
	//a System.out.println(
	 
	 ler.close();

	}

}
