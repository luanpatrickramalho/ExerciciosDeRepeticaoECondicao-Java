import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        String nome;
        int contador = 1, nvezes;
        System.out.printf("Informe seu nome:");
        Scanner teclado = new Scanner(System.in);
        nome = teclado.next();

        System.out.printf("Agora " + nome + " informe quantas vezes deseja repetir o nome: ");
        Scanner teclado2 = new Scanner(System.in);
        nvezes = teclado2.nextInt();

        while (contador <= nvezes) {
            System.out.println(nome + " x" + contador);
            contador++;
        }
        teclado.close();


    }
}
