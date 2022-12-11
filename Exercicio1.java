import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        sc.close();
        calculaResultado(n);
    }

    static void calculaResultado(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}
