package br.edu.unievangelica.ftt.treinamento;

public class Disciplina {
	
	private String nome;
	private String cargahoraria;
	private String ementa;
	private String professor;
	private Curso curso;
	
	
	
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	



}