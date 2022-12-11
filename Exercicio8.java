import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        sc.close();
        String tamanho = Integer.toString(numero);
        System.out.println("Seu número tem o total de " + tamanho.length() + " digitos");

    }
}