package br.com.unicuritiba.model;

public class Professor {
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String email;
	private String matricula;
	private boolean paciencia;
	
	public Professor(String nome, String cpf, String dataNascimento, String email, String matricula, boolean paciencia)
	{
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.matricula = matricula;
		this.paciencia = paciencia;
		
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isPaciencia() {
		return paciencia;
	}
	public void setPaciencia(boolean paciencia) {
		this.paciencia = paciencia;
	}
	
	
	

}
