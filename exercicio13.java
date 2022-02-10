import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int entreZeroECem = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = scan.nextInt();
            if ((numeros[i] >= 0) && (numeros[i] <= 100)) {
                entreZeroECem = entreZeroECem + 1;
            }
        }
        System.out.println("temos : " + entreZeroECem + " numeros entre 0 e 100.");
    }
}
