import java.util.Scanner;

public class nomeInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.next();

        String nomeInvertido = new StringBuilder(nome).reverse().toString();
        
        System.out.println(nome + " invertido é " + nomeInvertido);

        scanner.close();
    }
}