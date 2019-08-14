package Exercicio;
import java.util.*;
import java.util.Scanner;
import Exercicio.Aluno;


public class magalu {
	
	public static void main(String[] args) {	
		Scanner leia = new Scanner (System.in);
		List<Aluno> lst_aluno = new ArrayList<>();
		boolean qntAluno = true;
		
		while(qntAluno == true) {
			Aluno aluno = new Aluno();
			
			System.out.println("Digite o nome do aluno: ");
			aluno.setNome(leia.next());
			
			System.out.println("Digite a primeira nota do aluno: ");
			aluno.setNota1(leia.nextDouble());
			
			System.out.println("Digite a segunda nota do aluno: ");
			aluno.setNota2(leia.nextDouble());
			
			System.out.println("Digite a terceira nota do aluno: ");
			aluno.setNota3(leia.nextDouble());
			
			System.out.println("Deseja cadastrar mais aluno? (1 - para Sim) (2 - para Nao)");
			int valida = leia.nextInt();
			
			aluno.Calculo();
			
			lst_aluno.add(aluno);
			
			if(valida == 2) qntAluno = false;
		}
		
		System.out.println("Todos Alunos: ");
		for (Aluno objetoAluno : lst_aluno) {			
			System.out.println(objetoAluno.nome);
			System.out.println(objetoAluno.media);
		}
		
		System.out.println();		
		
		Aluno maiorNota = lst_aluno.get(0);
		for(int i = 1; i < lst_aluno.size(); i++) {
			if (lst_aluno.get(i).getMedia() > maiorNota.getMedia()) {
				maiorNota = lst_aluno.get(i);
			}
		}	
		
		System.out.println("Aluno de maior nota: ");
		System.out.println(maiorNota.nome);
		System.out.println(maiorNota.media);
		
			
	}
	
	
	
	

}
