package br.com.unicuritiba.model;

public class UnidadeCurricular {

	private String nome;
	private String professor;
	private Atividade[] atividades;
	private Aluno[] alunos;
	
	public UnidadeCurricular(String nome, String professor, Atividade[] atividade,Aluno[] aluno)
	{
		this.professor = professor;
		this.nome = nome;
		this.atividades = atividade;
		this.alunos = aluno;
		
	}
	
 String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Atividade[] getAtividades() {
		return atividades;
	}
	public void setAtividades(Atividade[] atividades) {
		this.atividades = atividades;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	
	
	
	
}
