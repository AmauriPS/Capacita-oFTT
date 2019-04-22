package br.edu.unievangelica.ftt.treinamento;

public class Curso {

	private String  nome;
	private int duracao;
	private String descricao;
	private String palestrante;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	
	public void SetDuracao (int duracao) {
		this.duracao = duracao;
		
	}
	
	public String getDescricao() {
		return this.descricao;
		
	}
	public void setDescricao(String descricao) {
		 this.descricao = descricao;
	}
	
	public String getPalestrante() {
		return this.palestrante;
	}
	
	public void setPalestrante(String palestrante) {
		this.palestrante = palestrante;
	}
	
	
}
