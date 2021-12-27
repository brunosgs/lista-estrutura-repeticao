package br.com.pythonbrasil.estruturarepeticao;

import java.util.Scanner;

/**
 * 
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
 * caso o valor seja inválido e continue pedindo até que o usuário informe um
 * valor válido.
 *
 */
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.println("**** Informe um número de 1 a 10 ****");

		do {
			System.out.print("Inserir número: ");
			numero = scan.nextInt();

			if (numero > 10) {
				System.out.println(numero + " é um valor inválido");
			}
		} while (numero > 10);

		scan.close();
	}

}
