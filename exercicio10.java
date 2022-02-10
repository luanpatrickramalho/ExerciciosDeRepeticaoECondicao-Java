import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        int tabuada;
        System.out.printf("Informe um numero:");
        Scanner teclado = new Scanner(System.in);
        tabuada = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
        teclado.close();
    }
}