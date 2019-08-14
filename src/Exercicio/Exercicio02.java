package Exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		float distancia = scanner.nextFloat();
		System.out.println("Digite um numero: ");
		float totalCombustivel = scanner.nextFloat();
		
		float ConsumoMedio = distancia/totalCombustivel;
		System.out.println("Consumo Medio = " + ConsumoMedio);
		

	}

}
