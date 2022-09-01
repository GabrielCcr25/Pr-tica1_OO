package br.com.exercicios3108;
import java.util.Scanner;
public class aluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome, matricula;
		double notaAV1, notaAV2,alteraNotaAV1,
		alteraNotaAV2 , alteraNotaAE,nota; 
		String curso, periodo;
	 System.out.println("Qual nota deseja alterar: 1-Alterar Av1\n2-Alterar Av2\n3-Alterar AE");
	 nota=ler.nextDouble();
	 	System.out.println("Coloque o valor da AV1 atualizado");
	 		alteraNotaAV1 = ler.nextDouble();
	 	System.out.println("Coloque o valor da AV2 atualizado");
	 		alteraNotaAV2=ler.nextDouble();
	 	System.out.println("Coloque o valor da AE atualizado(Caso tenha feito)");
	 		alteraNotaAE=ler.nextDouble();
	 		
	 		if(alteraNotaAV1+alteraNotaAV2>=60) {
	 			System.out.println("ALUNO APROVADO");
	 			
	 		}
	 		else 
	 			System.out.println("RECUPERAÇÃO");
	 		
	 	
	 			
	 		
	 	
	
	
	}

}
