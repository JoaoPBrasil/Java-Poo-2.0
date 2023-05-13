package br.com.unicuritiba;

import br.com.unicuritiba.model.Professor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor prof = new Professor("Diego Palma", "1234567995", "28/01/1986", "diego.navarro@unicuritiba.com.br",null, true);
		
		String nome, cpf, datanascimento, email; 
		boolean paciencia;
		
		prof.setNome("Joao Brasil");
		
		System.out.print(prof.getNome());
		System.out.print(prof.getCpf());
		System.out.print(prof.getDataNascimento());
		System.out.print(prof.getMatricula());
		System.out.print(prof.isPaciencia());
		
		
		
		
		
		
		
		
		
		
		
	}

}
