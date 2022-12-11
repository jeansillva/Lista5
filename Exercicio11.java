import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String calendario = "";
        String[] extenso = new String[3];

        do {
            System.out.println("Digite a data que deseja por extenso no formato DD/MM/AAAA: ");
            calendario = sc.nextLine();

            if (calendario.length() != 10) {
                System.out.println("Data Inválida!");
            }
        } while (calendario.length() != 10);
        sc.close();
        System.out.println(saida(calendario, extenso));
    }

    public static String saida(String bmg, String[] sai) {

        StringBuilder saida = new StringBuilder();

        sai = bmg.split("/");

        for (int x = 0; x < 3; x++) {
            if (x == 0) {
                saida.append(sai[x]);
                saida.append(" de ");
            }

            if (x == 1) {
                if (sai[x].compareTo("01") == 0) {
                    saida.append("Janeiro");
                } else if (sai[x].compareTo("02") == 0) {
                    saida.append("Fevereiro");
                } else if (sai[x].compareTo("03") == 0) {
                    saida.append("Março");
                } else if (sai[x].compareTo("04") == 0) {
                    saida.append("Abril");
                } else if (sai[x].compareTo("05") == 0) {
                    saida.append("Maio");
                } else if (sai[x].compareTo("06") == 0) {
                    saida.append("Junho");
                } else if (sai[x].compareTo("07") == 0) {
                    saida.append("Julho");
                } else if (sai[x].compareTo("08") == 0) {
                    saida.append("Agosto");
                } else if (sai[x].compareTo("09") == 0) {
                    saida.append("Setembro");
                } else if (sai[x].compareTo("10") == 0) {
                    saida.append("Outubro");
                } else if (sai[x].compareTo("11") == 0) {
                    saida.append("Novembro");
                } else if (sai[x].compareTo("12") == 0) {
                    saida.append("Dezembro");
                } else {
                    saida.append(sai[x]);
                }
                saida.append(" de ");
            }
            if (x == 2) {
                saida.append(sai[x]);
            }
        }
        return saida.toString();
    }
}