import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        int idade = 0, contador = 1;
        float media;
        Scanner teclado = null;
        while (contador <= 20) {
            System.out.printf("informe a " + contador + "a idade: ");
            teclado = new Scanner(System.in);
            idade = idade + teclado.nextInt();
            contador++;
        }
        teclado.close();
        media = (idade / 20);
        System.out.println("media das idades: " + media);
    }
}

