import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        // Extanciando Scanner para coletade dados
        Scanner scanner = new Scanner(System.in);
        // Exemplo de vetor para armazenar 4 notas
        double[] notas = new double[4];
        // somador das notas informadas
        double soma = 0;

        // Entrada de dados, quantidades de notas para fazer media
        System.out.print("Informe a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        // Entrada de dados, notas
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Informe a " + (i + 1) + "° nota: ");
            // Armazena as notas no vetor de notas
            notas[i] = scanner.nextDouble();

            //somando as notas de acordo com as notas informadas
            soma += notas[i];
        }

        // Calculando a média das notas informadas pelo usuário
        double media = soma/ quantidadeNotas;

        System.out.println("Média: " + media);

        scanner.close();
    }
}
