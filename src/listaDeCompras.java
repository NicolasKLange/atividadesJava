import java.util.Scanner;

public class listaDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char sair = 'n';
        int contador = 1;

        while (sair == 'n') {
            System.out.print("Informe o "+ contador +"° produto: ");
            String[] produtos = new String[contador];
            
            System.out.println("Deseja sair?");
            char saida = Character.toUpperCase(scanner.next().charAt(0));
            contador ++;
        }
        
        
    }
}
