package br.com.pythonbrasil.estruturarepeticao;

import java.util.Scanner;

/**
 * 
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
 * pedir as informações.
 *
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String usuario;
		String senha;
		boolean verificaSenhaUsuario;

		do {
			System.out.print("Usuário: ");
			usuario = scan.nextLine();

			System.out.print("Senha: ");
			senha = scan.nextLine();

			verificaSenhaUsuario = senha.equals(usuario);

			if (verificaSenhaUsuario) {
				System.out.println("A senha não deve ser a igual o usuário!\n");
			}
		} while (verificaSenhaUsuario);

		scan.close();

	}

}
