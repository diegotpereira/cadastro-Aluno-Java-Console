package br.com.java.modelo;

import java.util.ArrayList;

public class Sala {
	
	ArrayList<Aluno> listaDeAlunos;
	
	public Sala() {
		this.listaDeAlunos = new ArrayList<>();
	}
	
	public void insereAluno(Aluno novoAluno) {
		novoAluno.calculaNotas();
		listaDeAlunos.add(novoAluno);
	}
	
	public void listarAlunos() {
		System.out.println("\nLista de alunos");
		
		for(Aluno alunoNaLista:listaDeAlunos) {
			alunoNaLista.listar();
		}
	}
	
	public void listarSituacao() {
		System.out.println("\nSituacao");
		
		for(Aluno alunoNaLista:listaDeAlunos) {
			alunoNaLista.listarSituacao();
		}
	}
}
