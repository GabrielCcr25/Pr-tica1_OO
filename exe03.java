package br.com.POOaula2;

public class exe03 {

	private String nome;
	private int matricula;
	private float notaAV1, notaAV2, notaAE;
	private String curso ;
	
	public exe03(String nome, int matricula, float notaAV1, float notaAV2, float notaAE, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
	}
	
	public void alteraNotaAV1(float nota)
	{
		this.notaAV1=nota;
	}
	public void alteraNotaAV2(float nota)
	{
		this.notaAV2=nota;
	}
	public void alteraNotaAE(float nota)
	{
		this.notaAE=nota;
	}
	public String avaliarAluno()
	{
		if((this.notaAV1+notaAV2)>60)
			return "Aprovado";
		else
			return "Recuperação";
	}
	public String avaliarRecuperacao() 
	{
		if((this.notaAV1+this.notaAV2+this.notaAE)/2>=60)
			return "Aprovado";
		else
			return "Reprovado";
	}






}

