package br.com.pythonbrasil.estruturarepeticao;

import java.util.Scanner;

/**
 * 
 * Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem
 * caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um
 * valor v�lido.
 *
 */
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;

		System.out.println("**** Informe um n�mero de 1 a 10 ****");

		do {
			System.out.print("Inserir n�mero: ");
			numero = scan.nextInt();

			if (numero > 10) {
				System.out.println(numero + " � um valor inv�lido");
			}
		} while (numero > 10);

		scan.close();
	}

}
