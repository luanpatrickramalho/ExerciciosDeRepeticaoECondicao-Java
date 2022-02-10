import java.util.Scanner;
import java.util.*;

public class exercicio08 {
    public static void main(String[] args) {

        int idade = 0;
        int somaIdade = 0;
        int cont = 0;
        int maiorDeIdade = 0;
        float mediaIdade = 0;

        Scanner scanner = null;
        while (cont < 20) {
            cont++;
            System.out.println("informe a idade ");
            scanner = new Scanner(System.in);
            idade = scanner.nextInt();
            somaIdade = somaIdade + idade;
            mediaIdade = somaIdade / 5;
            if (idade >= 18) {
                maiorDeIdade = (maiorDeIdade + 1);
            }
        }
        scanner.close();
        System.out.println("Media das Idades: " + mediaIdade);
        System.out.println("Maiores de 18:" + maiorDeIdade);
    }
}