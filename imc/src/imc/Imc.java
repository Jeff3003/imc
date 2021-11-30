package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		int imc;
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite seu peso: ");
		double peso = scan.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		imc = (int) ( peso / (altura * altura));
		System.out.println("Seu imc é: " + imc);
		
		if (imc <= 18){
			System.out.println("Abaixo do peso ideal !");
		}else if (imc > 18.5 && imc < 24.9 ) {
			System.out.println ("Peso Normal. Parabéns !");
		}else if (imc > 25 && imc <= 29.9) {
			System.out.println("Sobrepeso !");
		}else if (imc > 30 && imc <= 34.9) {
			System.out.println("Obesidade (Grau I)");
		}else if (imc > 35 && imc <= 39.9) {
			System.out.println("Obesidade Severa (Grau II)");
		}else {
			System.out.println("Obesidade Mórbida (Grau III");
		}

	}

}
