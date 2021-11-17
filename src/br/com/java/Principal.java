package br.com.java;

import java.util.Scanner;

import br.com.java.modelo.Aluno;
import br.com.java.modelo.Sala;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		int qtdNotas;
		float nota = 0;
		
		String nome;
		String cpf;
		
		Sala novaSala = new Sala();
		Aluno novoAluno = new Aluno();

		do {
			
			System.out.println("\n-----------------");
			System.out.println("-------MENU--------");
			System.out.println("Escolha uma Opcao: ");
			System.out.println("1 - Inserir Aluno  ");
			System.out.println("2 - Listar Aluno   ");
			System.out.println("3 - Situacao       ");
			System.out.println("4 - Sair           ");
			
			
			Scanner teclado = new Scanner(System.in);
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcao) {
			case 1:
				
				System.out.println("\nDigite seu nome:");
				nome = teclado.nextLine();
				
				System.out.println("\nDigite seu Cpf:");
				cpf = teclado.nextLine();
				
				novoAluno = new Aluno(nome, cpf);
				
				System.out.println("\nQuantas notas:");
				qtdNotas = teclado.nextInt();
				
				for(int i = 0; i < qtdNotas; i++) {
					System.out.println("\nNotas " + (i + 1));
					nota = teclado.nextFloat();
					novoAluno.insereNotas(nota);
				}
				
				novaSala.insereAluno(novoAluno);
				
				break;
				
             case 2:
				novaSala.listarAlunos();
				break;
				
			 
             case 3:
            	 novaSala.listarSituacao();
            	 break;
            	 
             case 0:
            	 System.out.println("\n saindo...");
            	 break;

			default:
				System.out.println("Op��o inv�lida");
			}
			
		} while (opcao != 0);
	}
}
