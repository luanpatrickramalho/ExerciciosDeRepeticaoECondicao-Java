import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int maiorQueOito = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = scan.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (numeros[i] > 8) {
                maiorQueOito = maiorQueOito + 1;
            }
        }
        System.out.println("temos : " + maiorQueOito + " numeros maior que 8.");
    }
}