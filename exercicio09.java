import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        String[] nome = new String[10];
        int[] idade = new int[10];
        int idadeMaisNova = 99;
        String nomeMaisNovo = "";
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome: ");
            nome[i] = teclado.next();
            System.out.println("Digite a idade:");
            idade[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (idade[i] < idadeMaisNova) {
                idadeMaisNova = idade[i];
                nomeMaisNovo = nome[i];
            }
        }
        System.out.println("Pessoa Mais nova Nome: " + nomeMaisNovo);
        System.out.println("Pessoa Mais nova Idade: " + idadeMaisNova);
    }
}

