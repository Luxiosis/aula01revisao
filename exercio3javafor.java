//  Exercício 3:  Escreva um programa que leia o nome e a idade de cinco pessoas
//  e ao final informe quem é o mais novo, o mais velho e qual a média de idades; use arrays
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String nomes[] = new String[5];
	    int idades[] = new int[5];
	    
	    for (int i = 0; i < 5; i++) {
	        System.out.print("Insira um nome: ");
	        nomes[i] = sc.next();
	    }
	    for (int j = 0; j < 5; j++) {
	        System.out.print("Insira a idade deles, sucessivamente: ");
	        idades[j] = sc.nextInt();
	    }
	    
	    //int posicao = 0;
	    //for (String k : nomes){
	    //    System.out.print(k + ", idade: ");
	    //    System.out.println(idades[posicao]);
	    //    posicao++;
	    //} 
	    
	    int menor = idades[0];
        int maior = idades[0];
        String maior_nome = nomes[0];
        String menor_nome = nomes[0];
        for(int k = 0; k < 5; k++) {
            if(idades[k] > maior) {
                maior = idades[k];
                maior_nome = nomes[k];
            }
            else if (idades[k] < menor) {
                menor = idades[k];
                menor_nome = nomes[k];
            }
        }
        
        System.out.println("Menor idade: " + menor + ", idade do " + menor_nome);
        System.out.println("Maior idade: " + maior + ", idade do " + maior_nome);
        
        int soma = 0;

        for (int l : idades) {
           soma += l;
        }
        System.out.println("A soma das idades é: " + soma);
	}
}
