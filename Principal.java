package cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int opcao;
		
		System.out.println("MENU");
		System.out.println("1- Adicionar moedas");
		System.out.println("2- Remover Moedas");
		System.out.println("3- Listar moedas");
		System.out.println("4- Total convertido");
		System.out.println("0- Finalizar o atendimento");
		
		opcao = sc.nextInt();
		
		while (opcao != 0) {
			switch(opcao) { 
			case 1: 
				System.out.println("Quantas moedas deseja adicionar?");
				System.out.println();
				
				break;
			case 2:
				System.out.println("Quantas moedas deseja remover?");
				System.out.println();
				
				break;
			case 3:
				// Listar
				//System.out.println("Listagem de todas as moedas") + listagemMoedas;

				break;
			case 4:
				// Total convertido
				//System.out.println("Total convertido ") + totalConvertido;

				break;
			default:
				System.out.println("Opção inválida");
				
			}
			System.out.println("Digite o número desejado a baixo");
			System.out.println("1- Adicionar moedas");
			System.out.println("2- Remover Moedas");
			System.out.println("3- Listar moedas");
			System.out.println("4- Total convertido");
			System.out.println("0- Finalizar o atendimento");
			opcao = sc.nextInt();
		}	
	}

}
