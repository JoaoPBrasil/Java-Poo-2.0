package br.com.unicuritiba.model;

public class Aluno {

	private String email;
	private String nome;
	private String dataNascimento;
	private String cpf;
	private String ra;
	
	public Aluno(String email, String nome, String dataNascimento, String cpf, String ra)
	{
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.ra = ra;
		this.nome= nome;
		
	}
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getDataNascimento() 
	{
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) 
	{
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() 
	{
		return cpf;
	}
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	public String getRa()
	{
		return ra;
	}
	public void setRa(String ra) 
	{
		this.ra = ra;
	}

	
	
	
	
	
	
	
	
}
