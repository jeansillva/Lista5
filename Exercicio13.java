import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas linhas deseja imprimir: ");
        int ln = sc.nextInt();
        if (ln < 1) {
            ln = 1;
        } else if (ln > 20) {
            ln = 20;
        }
        System.out.println("Digite quantas colunas deseja imprimir: ");
        int cln = sc.nextInt();

        if (cln < 1) {
            cln = 1;
        } else if (cln > 20) {
            cln = 20;
        }
        System.out.println(moldurazinha(ln, cln));
        sc.close();
    }

    public static String moldurazinha(int ln, int cln) {
        String retornar = "";

        for (int a = 0; a < ln; a++) {
            if (a == 0) {
                System.out.print("\n+");
            }
            System.out.print("-");

            if (a == (ln - 1)) {
                System.out.print("+");
            }
        }
        for (int b = 0; b < cln; b++) {
            for (int i = 0; i < ln; i++) {
                if (i == 0) {
                    System.out.print("\n|");
                } else {
                    System.out.print(" ");
                }
                if (i == (ln - 1)) {
                    System.out.print(" |");
                }
            }
        }
        for (int i = 0; i < ln; i++) {
            if (i == 0) {
                System.out.print("\n+");
            }
            System.out.print("-");
            if (i == (ln - 1)) {
                System.out.print("+");
            }
        }
        return retornar;
    }

}