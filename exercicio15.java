import java.util.Scanner;
import java.util.*;

public class exercicio15 {
    public static void main(String[] args) {
        int numero = 0, soma = 0;
        while (numero >= 0) {
            System.out.printf("Informe um valor: ");
            Scanner scanner = new Scanner(System.in);
            numero = scanner.nextInt();
            if (numero >= 0) {
                soma = soma + numero;
            }
        }
        System.out.println("A Soma dos numeros é: " + soma);
    }
}

