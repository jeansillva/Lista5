import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        char in;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entre com o valor das horas: ");
            int hr = sc.nextInt();
            System.out.println("Entre com o valor em minutos: ");
            int min = sc.nextInt();
            if (hr > 12) {
                hr = hr - 12;
                saida(hr, min, 'P');
            } else if (hr == 12) {
                saida(hr, min, 'P');
            } else if (hr == 24) {
                hr = 0;
                saida(hr, min, 'A');
            } else {
                saida(hr, min, 'A');
            }
            System.out.println("Deseja realizar uma nova conversão?");
            sc.nextLine();
            in = sc.nextLine().charAt(0);
        } while (in != 'n');
        sc.close();
    }

    static void saida(int h, int m, char x) {
        System.out.println(h + ":" + m + " " + x + ".M.");
    }
}