import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int entre0e100 = 0;
        int entre101E200 = 0;
        int maiorQue200 = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = scan.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if ((numeros[i] >= 0) && (numeros[i] <= 100)) {
                entre0e100 = entre0e100 + 1;
            } else if ((numeros[i] >= 101) && (numeros[i] <= 200)) {
                entre101E200 = entre101E200 + 1;
            } else if (numeros[i] > 200) {
                maiorQue200 = maiorQue200 + 1;
            }
        }
        System.out.println("temos : " + entre0e100 + " numeros entre 0 e 100.");
        System.out.println("temos : " + entre101E200 + " numeros entre 101 e 200.");
        System.out.println("temos : " + maiorQue200 + " numeros maior que 200.");
    }
}