package br.com.POOaula2;

public class exe02 {

	
		private String nome;
		private double salario;
		private int horasAula;
		
		exe02(String nome,double salario, int horasAula){
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula; 
		}
			double getGastos() {
			double bonus;
			bonus=40*horasAula;
			return this.salario + bonus;
		}
		
		String getInfo() {
			return "nome" + this.nome + "com salario" + getGastos();
		
		}

   }
	
	
