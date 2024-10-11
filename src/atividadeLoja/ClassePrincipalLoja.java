package atividadeLoja;

import lojaObjetos.Produto; 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassePrincipalLoja {
	
	static List<Produto> listaProdutos = new ArrayList<Produto>();
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		menuInicial();
	}
	
	static public void menuInicial() {
		
		System.out.println("--------------------------------------------------");
		System.out.println("Bem vindo(a), ao gerenciador de produtos!");
		System.out.print("\n");
		
		System.out.println("Escolha entre as opções a baixo:");
		System.out.println("1 - Para cadastrar novo produto.");
		System.out.println("2 - Para listar produtos cadastrados.");
		System.out.println("3 - Para remover produto.");
		System.out.println("0 - Sair do sistema.");
		
		int escolhaUsuario = scan.nextInt();
		
		if (escolhaUsuario == 1) {
			cadastroProdutos();
		} else if (escolhaUsuario == 2) {
			listarProdutos();
		} else if (escolhaUsuario == 3) {
			removeProdutos();
		} else if (escolhaUsuario == 0) {
			System.out.println("Encerrando sistema...");
			System.out.println("Sistema encerrado.");
			System.exit(0);
		} else {
			System.out.println("Valor inválido, escolha entre as opções e tente novamente.");
			menuInicial();
		}
		
	}
	
	static public void cadastroProdutos() {
		Produto produto = new Produto();
		System.out.println("Cadastro de produtos:");
		System.out.printf("\n");
		
		System.out.println("Digite as informações do produto:");
		
		System.out.println("Nome do produto:");
		produto.setNome(scan.next());
		scan.nextLine();
		
		System.out.println("ID do produto:");
		produto.setId(scan.nextInt());
		scan.nextLine();
		
		System.out.println("Preço do produto:");
		produto.setPreco(scan.nextDouble());
		scan.nextLine();
		
		System.out.println("Quantidade:");
		produto.setQuant(scan.nextInt());
		scan.nextLine();
		
		listaProdutos.add(produto);
		System.out.println("Produto adicionado com sucesso!");
		
		menuInicial();
		
	}
	
	static public void listarProdutos() {
		
		System.out.println("Lista de produtos:");
		System.out.print("\n");
		
		if (listaProdutos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			menuInicial();
		} else {
			
			for(Produto listarProduto : listaProdutos) {
				System.out.println(listarProduto);
			}
		}
		menuInicial();
		
	}
	
	static public void removeProdutos() {
		
		if (listaProdutos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			menuInicial();
		} else {
			
			for(Produto listarProduto : listaProdutos) {
				System.out.println(listarProduto);
			}
		}
		System.out.printf("\n");
		System.out.println("Digite o ID do produto para remover:");
		
		int escolhaId = scan.nextInt();
		
		for (Produto produto : listaProdutos) {
			
			if (escolhaId == produto.getId()) {
				listaProdutos.remove(produto);
				System.out.println("Produto removido com sucesso!");
				break;
			}
		}
		menuInicial();
	}
}
