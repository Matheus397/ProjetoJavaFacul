package Exercicio;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = leia.nextInt();
		System.out.println("Digite um numero: ");
		int n2 = leia.nextInt();
		
		int soma = n1+n2;
		System.out.println("Soma = " + soma);
		
		int subtra��o = n1-n2;
		System.out.println("Subtra��o = " + subtra��o);
		
		int multiplica��o = n1*n2;
		System.out.println("Multiplica��o = " + multiplica��o);
		
		int divis�o = n1/n2;
		System.out.println("Divis�o = " + divis�o);
	}

}
