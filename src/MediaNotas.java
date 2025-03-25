import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        // Extanciando Scanner para coletade dados
        Scanner scanner = new Scanner(System.in);
        // Vetor para armazenar as notas
        double[] notas = new double[4];
        // somador das notas informadas
        double soma = 0;

        // Entrada de dados, notas
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "° nota: ");
            // Armazena as notas no vetor de notas
            notas[i] = scanner.nextDouble();

            //somando as notas de acordo com as notas informadas
            soma += notas[i];
        }

        // Calculando a média das 4 notas
        double media = soma/4;

        System.out.println("Média: " + media);

        scanner.close();
    }
}
