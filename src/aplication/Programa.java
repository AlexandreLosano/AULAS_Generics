package aplication;

import java.util.Scanner;

import servico.Impressao;


public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Impressao<String> ps = new Impressao<>();

		System.out.print("Quantos Valores? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		System.out.println("Primeiro: " + ps.first());

		sc.close();

	}

}
