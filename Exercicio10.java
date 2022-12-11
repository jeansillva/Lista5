import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        int valorPonto = somaDados();
        if (valorPonto == 7 || valorPonto == 11) {
            System.out.println("Sua soma de dados foi: " + valorPonto + " Você é um Natural! VOCÊ GANHOU");
        } else if (valorPonto == 2 || valorPonto == 3 || valorPonto == 12) {
            System.out.println("Sua soma de dados foi: " + valorPonto + " CRAPS! VOCÊ PERDEU.");
        } else if ((valorPonto == 4 || valorPonto == 5 || valorPonto == 6 || valorPonto == 8 || valorPonto == 9
                || valorPonto == 10)) {
            System.out.println("Sua soma de dados foi: " + valorPonto + " Você marcou PONTO! TIRE O NÚMERO "
                    + valorPonto + " novamente para vencer!");
            while (valorPonto != 7) {
                int valor2 = somaDados();
                if (valorPonto == valor2) {
                    System.out.println("Você tirou " + valor2 + " VOCÊ GANHOU!");
                    break;
                } else if (valor2 == 7) {
                    System.out.println("Você tirou " + valor2 + " VOCÊ PERDEU!");
                    break;
                }
                System.out.println("Você tirou " + valor2 + " tente tirar " + valorPonto + " para ganhar.");
            }

        }
    }

    static int somaDados() {
        Random dado1 = new Random();
        int numA = dado1.nextInt(6) + 1;

        Random dado2 = new Random();
        int numB = dado2.nextInt(6) + 1;

        int soma = numA + numB;
        return soma;
    }
}
