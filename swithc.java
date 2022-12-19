import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Diga o numero de um ano: ");
		int ano = sc.nextInt();
		System.out.print("Diga o numero de um mes do ano: ");
		int mes = sc.nextInt();
        switch(mes) {
            case 4: case 6: case 9: case 11:
                System.out.print("30 dias");
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                System.out.print("31 dias");
                break;
            case 2:
                if((ano % 400 == 0) || ((ano % 100 != 0) && (ano % 4 == 0))) {
                    System.out.println("29 dias");
                }
                else {
                    System.out.println("28 dias");
                }
                break;
            default:
                System.out.println("Mês Inválido");
        }
	}
}
