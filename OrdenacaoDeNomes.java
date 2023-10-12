import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoDeNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes separados por vírgula: ");
        String input = scanner.nextLine();

        String[] nomesArray = input.split(",");

        for (int i = 0; i < nomesArray.length; i++) {
            nomesArray[i] = nomesArray[i].trim();
        }

        Arrays.sort(nomesArray);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomesArray) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
