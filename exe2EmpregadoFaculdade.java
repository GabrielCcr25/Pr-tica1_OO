package br.com.exercicios3108;

public class exe2EmpregadoFaculdade {
	
	private String nome;
	private double salario;
	private int horasAula;
	double getGastos(){
	return this.salario + (horasAula * 40);
	}
	String getInfo(){
		return "nome: " + this.nome +  "com salário"  + this.salario + (horasAula * 40);
	
	}
	
}


