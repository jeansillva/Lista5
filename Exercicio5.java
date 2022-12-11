import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor qualquer: ");
        double valor = sc.nextDouble();
        System.out.println("Agora a % do imposto em valor decimal");
        double porcentagem = sc.nextDouble();
        sc.close();
        System.out.println(somaImposto(valor, porcentagem));
    }

    static double somaImposto(double x, double y) {
        x = x * y + x;
        return x;
    }

}
