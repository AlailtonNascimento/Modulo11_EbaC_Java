import java.util.*;

public class OrdenacaoPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes e gêneros separados por vírgula (Ex: José - M, Maria - F): ");
        String input = scanner.nextLine();

        String[] nomesGeneros = input.split(",");

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        for (String nomeGenero : nomesGeneros) {
            String[] partes = nomeGenero.trim().split("-");
            String nome = partes[0].trim();
            String genero = partes[1].trim().toUpperCase();
            if (genero.equals("M")) {
                nomesMasculinos.add(nome);
            } else if (genero.equals("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Erro: Gênero inválido para o nome " + nome);
            }
        }

        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        System.out.println("Nomes Masculinos em ordem alfabética:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("Nomes Femininos em ordem alfabética:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

