package br.com.java.modelo;

import java.util.ArrayList;

public class Aluno {
	
	String nome;
	String cpf;
	String situacao = "reprovado";
	float total = 0;
	ArrayList<Float> notasAluno = new ArrayList<>();
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public ArrayList<Float> getNotasAluno() {
		return notasAluno;
	}

	public void setNotasAluno(ArrayList<Float> notasAluno) {
		this.notasAluno = notasAluno;
	}
	
	public void insereNotas(float nota) {
		notasAluno.add(nota);
	}
	
	void listar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nCpf: " + this.cpf);
		
		for(int i = 0; i < notasAluno.size(); i++) {
			System.out.println("Nota " + ( i + 1 ) + ": " + this.notasAluno.get(i));
		}
	}
	
	public void listarSituacao() {
		System.out.println("\nNome: "  + this.nome);
		System.out.println("\nTotal: " + this.total);
		System.out.println("\nSituacao: " + this.situacao);
	}
	
	public void calculaNotas() {
		for(float notaDaLista:notasAluno) {
			total = total + notaDaLista;
		}
		
		if (total >= 70) {
			this.situacao = "aprovado";
		} else {
			this.situacao = "reprovado";
		}
	}
}
