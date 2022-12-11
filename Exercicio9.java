import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número que você quer inverter:");
        int numero = sc.nextInt();
        sc.close();
        String s = Integer.toString(numero);
        System.out.println("O número invertido é: " + inverterNumero(s));
    }

    public static String inverterNumero(String s) {
        int i, n;
        n = s.length();
        String sTeste = "";
        for (i = (n - 1); i >= 0; i--) {
            sTeste = sTeste + s.charAt(i);
        }
        return sTeste;
    }
}