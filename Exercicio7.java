import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {
        int diaAtraso;
        double vlrPrestacao;
        double total = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite o valor do seu " + i + "º pagamento: ");
            vlrPrestacao = sc.nextDouble();
            if (vlrPrestacao == 0) {
                break;
            }
            System.out.println("Entre com a quantidade de dias em atraso: ");
            diaAtraso = sc.nextInt();
            total += valorPagamento(vlrPrestacao, diaAtraso);
            System.out.println("Valor a ser pago: " + valorPagamento(vlrPrestacao, diaAtraso));
            i++;
        } while (vlrPrestacao != 0);
        sc.close();
        System.out.println("O total do dia foi de: " + total);

    }

    static double valorPagamento(double vlrPrestacao, int diasAtraso) {
        double valorPagar;
        if (diasAtraso > 0) {
            valorPagar = (vlrPrestacao * 103 / 100) + (vlrPrestacao * diasAtraso * 1 / 1000);
            return valorPagar;
        } else {
            valorPagar = vlrPrestacao;
            return valorPagar;
        }
    }
}