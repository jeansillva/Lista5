import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 3 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        System.out.println(calculaArgumentos(num1, num2, num3));
    }

    static int calculaArgumentos(int x, int y, int z) {
        int soma = x + y + z;
        return soma;
    }
}
