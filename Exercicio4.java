import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número");
        int num = sc.nextInt();
        sc.close();
        letra(num);
    }

    static void letra(int x) {
        if (x >= 0) {
            System.out.println("P");
        } else {
            System.out.println("N");
        }
    }
}
