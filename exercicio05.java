import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        int resultado = 0, contador = 1;
        Scanner teclado = null;
        while (contador <= 10) {
            System.out.printf("informe o " + contador + "valor : ");
            teclado = new Scanner(System.in);
            resultado = resultado + teclado.nextInt();
            contador++;
        }
        teclado.close();
        System.out.println("O resultado da soma e: " + resultado);

    }

}
