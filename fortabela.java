// Exercício 02: Elaborar um programa que solicite um número ao usuário e
// faça a tabuada dele na tela, no formato:

//5 X 1 = 5
//......
//5 X 10 = 10

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        int[] tabela = {1,2,3,4,5,6,7,8,9,10};
        for(int i : tabela) {
            int resultado = i * numero;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
	}
}
