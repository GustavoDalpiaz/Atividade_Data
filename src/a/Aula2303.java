package a;

import java.util.Scanner;

public class Aula2303 {
	/*
	 * construir um programa que leia 3 números inteiros no intervalo entre 1 e 9.
	 * em seguida construir três funções dentro da mesma classe onde está main: -
	 * construir uma função que recebe os 3 números e mostra o maior deles -
	 * construir outra função com o maior deles para mostrar a seguinte tabela de
	 * multiplicação (tabela 1). - construir outra função ainda para mostrar a outra
	 * tabela de multiplicação (tabela2)
	 * 
	 * 
	 * tabela1 (maior = 9) 1 2 4 3 6 9 4 8 12 16 5 10 15 20 25 6 12 18 24 30 36 7 14
	 * 21 28 35 42 49 8 16 24 32 40 48 56 64 9 18 27 36 45 54 63 72 81
	 * 
	 * tabela 2 (maior = 9) 1 2 3 4 5 6 7 8 9 4 6 8 10 12 14 16 18 9 12 15 18 21 24
	 * 27 16 20 24 28 32 36 25 30 35 40 45 36 42 48 54 49 56 63 64 72 81
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vetor[];
		vetor = new int[3];
		System.out.println("informe 3 Numeros Inteiros entre 1 e 9");
		for (int cont = 0; cont < vetor.length;) {
			int numero = 0;
			numero = teclado.nextInt();
			if (numero >= 1 && numero <= 9) {
				vetor[cont] = numero;
				cont++;

			} else {
				System.out.println("informe um numero ente 1 e 9 !!!/n");
			}

		}
		int maior = maior(vetor);

		int tabela = tabelaUm(maior);
		tabelaDois(maior);
	}

	private static void tabelaDois(int maior) {
		System.out.println("\nTabela 2 \n");
		int valor = 1;
		for (int lin = 1 ; lin <= maior; lin++) {
			int cont = lin;
			for (int col = maior; col >= lin; col--) {
				System.out.printf("%4d", valor * cont);
				cont++;
			
			}
			valor++;
			System.out.println(" ");
		}
		

		
	}

	private static int tabelaUm(int maior) {
		System.out.println("\nTabela 1 \n");
		int valor = 1;

		for (int lin = 1; lin <= maior; lin++) {
			for (int col = 1; col <= lin; col++) {

				System.out.printf("%4d", valor * col);
			}
			valor++;
			System.out.println(" ");
		}

		return valor;
	}

	private static int maior(int[] vetor) {
		int maior = 0;
		for (int cont = 0; cont < vetor.length; cont++) {
			if (vetor[cont] > maior) {
				maior = vetor[cont];
			}

		}
		System.out.println("O Maior é " + maior);

		return maior;
	}

}
