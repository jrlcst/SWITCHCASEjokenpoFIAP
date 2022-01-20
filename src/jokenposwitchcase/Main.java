package jokenposwitchcase;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("--------------------------------");
		System.out.println("       JOKENPO                   ");
		System.out.println("---------------------------------");
		System.out.println("Escolha um numero: ");
		System.out.println(" PAPEL = 0");
		System.out.println(" TESOURA = 1");
		System.out.println(" PEDRA = 2");;
		
		System.out.println("Qual sua opção?: ");
		n1 = sc.nextInt();
		
		n2 = new Random().nextInt(2);
		System.out.printf("A opçao da maquina foi: ");
		System.out.println(n2);
		
		switch (n1){
			case 0:
				switch (n2){
					case 0:
						System.out.println("EMPATE!!!");
						break;
					case 1:
						System.out.println("VOCE PERDEU!! TESOURA CORTA PAPEL!!!");
						break;
					case 2:
						System.out.println("VOCE GANHOU!! PAPEL EMBRULHA PEDRA!!! PARABENS");
						break;
						default: 
				} break;
			case 1:
				switch(n2) {
					case 0: 
						System.out.println("VOCE GANHOU!! TESOURA CORTA PAPEL!!! PARABENS");
						break;
					case 1:
						System.out.println("EMPATE!!!");
						break;
					case 2:
						System.out.println("VOCE PERDEU!! PEDRA QUEBRA TESOURA!!!");
						break;
					default: 
				} break;
			case 2:
				switch(n2) {
						case 0:
							System.out.println("VOCE PERDEU!! PAPEL EMBRULHA PEDRA!!!");
							break;
						case 1:
							System.out.println("VOCE GANHOU!! PEDRA QUEBRA TESOURA!!! PARABENS");
							break;
						case 2:
							System.out.println("EMPATE");
							break;
						default: 
				} break;
		}
	}
}
