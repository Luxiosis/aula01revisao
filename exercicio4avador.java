// Exercício 4: Escreva um programa que entre com o nome, peso e altura de cinco pessoas
// calcule o IMC de cada um e ao final informe se alguém está fora do peso ideal (IMC ideal é entre 
// 18.5 e 25)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String nomes[] = new String[5];
	    double pesos[] = new double[5];
	    double alturas[] = new double[5];
	    
	    for (int i = 0; i < 5; i++) {
	        System.out.print("Insira um nome: ");
	        nomes[i] = sc.next();
	    }
	    for (int j = 0; j < 5; j++) {
	        System.out.print("Insira o peso deles, respectivamente: ");
	        pesos[j] = sc.nextDouble();
	    }
	    for (int k = 0; k < 5; k++) {
	        System.out.print("Insira a altura deles, respectivamente: ");
	        alturas[k] = sc.nextDouble();
	    }
	    
	    for (int l = 0; l < 5; l++) {
	        double imc = pesos[l] / (alturas[l] * alturas[l]);
	        if (imc < 18.5 || imc > 25.0) {
	            System.out.println(nomes[l] + " está com um IMC fora da média");
	        }
	    }
	}
}
