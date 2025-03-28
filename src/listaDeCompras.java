import java.util.ArrayList;
import java.util.Scanner;

public class listaDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Lista dos produtos
        ArrayList<String> produtos = new ArrayList<>();

        //Laço para o  usuarioA poder adicionar todos os produtos que queira
        while (true) {
            //Entrada de dados, produto
            System.out.print("Informe o "+ (produtos.size() + 1) +"° produto: ");
            produtos.add(scanner.nextLine());
            
            // pedindo ao usuario se deseja sair do programa
            System.out.print("Deseja sair? (s/n): ");
            char sair = scanner.next().toLowerCase().charAt(0);
            // Pular linha
            scanner.nextLine();
            
            // Verificando se o usuario deseja sair do programa
            if (sair == 's') {
                break; 
            }
        }

        scanner.nextLine();
        // Saida  de dados, lista de compras, aparece apos usuario sair do programa
        System.out.println("*** Lista de Compras ***");

        for(String produto : produtos) {
            System.out.println("- " + produto);
        }


        scanner.close();
    }
}
