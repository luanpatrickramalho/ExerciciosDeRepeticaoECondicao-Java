import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        String nome;
        int contador = 1;
        System.out.println("Informe seu nome:");
        Scanner teclado = new Scanner(System.in);
        nome = teclado.next();
        while (contador <= 20) {
            System.out.println(nome + "x" + contador);
            contador++;
        }
        teclado.close();

    }
}
