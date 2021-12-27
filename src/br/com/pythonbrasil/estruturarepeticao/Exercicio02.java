package br.com.pythonbrasil.estruturarepeticao;

import java.util.Scanner;

/**
 * 
 * Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a
 * senha igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a
 * pedir as informa��es.
 *
 */
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String usuario;
		String senha;
		boolean verificaSenhaUsuario;

		do {
			System.out.print("Usu�rio: ");
			usuario = scan.nextLine();

			System.out.print("Senha: ");
			senha = scan.nextLine();

			verificaSenhaUsuario = senha.equals(usuario);

			if (verificaSenhaUsuario) {
				System.out.println("A senha n�o deve ser a igual o usu�rio!\n");
			}
		} while (verificaSenhaUsuario);

		scan.close();

	}

}
