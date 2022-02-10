import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        int resultado = 0, contador = 1;
        while (contador <= 15) {
            System.out.printf(contador + " + " + resultado);
            resultado = resultado + contador;
            System.out.println(" = " + resultado);
            contador++;
        }
    }

}