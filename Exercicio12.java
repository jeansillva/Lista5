import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a palavra que deseja embaralhar: ");
        String palavra = sc.nextLine();
        List<String> testar = Arrays.asList(palavra.split(""));
        System.out.println(embaralhaPalavra(testar, palavra));
        sc.close();
    }

    public static String embaralhaPalavra(List<String> emboleira, String texto) {
        Collections.shuffle(emboleira);
        StringBuilder retorno = new StringBuilder(texto.length());
        retorno.append("A palavra digitada embaralhada fica assim: ");
        for (String x : emboleira) {
            retorno.append(x);
        }
        return retorno.toString();
    }
}