import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        int idade = 0, contador = 1;
        Scanner teclado = null;
        while (contador <= 20) {
            System.out.printf("informe a " + contador + "a idade: ");
            teclado = new Scanner(System.in);
            idade = idade + teclado.nextInt();
            contador++;
        }
        teclado.close();
        System.out.println("O resultado da soma e: " + idade);
    }
}