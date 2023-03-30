package a;

import java.util.Scanner;

public class ProgramaTemperatura {

	public static void main(String[] args) {
		int[] tempMax = new int[12];
        int[] tempMin = new int[12];

        Scanner teclado = new Scanner(System.in);

        // ler as temperaturas máximas de cada mês
        System.out.println("Informe as temperaturas máximas de cada mês:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Mês " + (i+1) + ": ");
            tempMax[i] = teclado.nextInt();
        }

        // ler as temperaturas mínimas de cada mês
        System.out.println("Informe as temperaturas mínimas de cada mês:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Mês " + (i+1) + ": ");
            tempMin[i] = teclado.nextInt();
        }

        int maiorTemp = Operacoes.encontrarMaior(tempMax);
        int menorTemp = Operacoes.encontrarMenor(tempMin);

        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("A maior temperatura do ano registrada foi de " + maiorTemp + " graus Celsius, em " +
                Operacoes.nomeMes(tempMax, maiorTemp) + ".");
        System.out.println("A menor temperatura do ano registrada foi de " + menorTemp + " graus Celsius, em " +
                Operacoes.nomeMes(tempMin, menorTemp) + ".");
    }
}
