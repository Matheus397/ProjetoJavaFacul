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
		
		int subtração = n1-n2;
		System.out.println("Subtração = " + subtração);
		
		int multiplicação = n1*n2;
		System.out.println("Multiplicação = " + multiplicação);
		
		int divisão = n1/n2;
		System.out.println("Divisão = " + divisão);
	}

}
