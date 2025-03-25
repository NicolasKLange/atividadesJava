import java.util.Scanner;

public class MediaMaisAlunos {
    public static void main(String[] args) {
        // Extanciando Scanner para coletade dados
        Scanner scanner = new Scanner(System.in);


        //Entrada de dado, quantidade de alunos
        System.out.print("Informe a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();
        // Entrada de dados, quantidades de notas para fazer media
        System.out.print("Informe a quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        // Vetor para armazenar nomes dos alunos
        String[] nomes = new String[qtdAlunos];
        // Matriz para armazenar as notas de cada aluno
        double[][] notas = new double[qtdAlunos][qtdNotas];
        
        // Entrada de dados, nomes e notas de cada  aluno
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "° aluno: ");
            nomes[i] = scanner.next();

            // Variavel para calcular media de cada aluno
            double soma = 0;

            // Entrada de dados, notas
            for (int j = 0; j < qtdNotas; j++) {
                System.out.println("Informe a " + (j + 1) + "° nota de " + nomes[i]);
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            // Pular linha
            scanner.nextLine();
        }

        // Saida de dados mostrar as medias de cada aluno
        System.out.println("\nMedia dos alunos");
        for (int i = 0; i < qtdAlunos; i++) {
            double soma = 0;
            for (int j = 0; j < qtdNotas; j++) {
                // Somando cada nota do aluno
                soma += notas[i][j];
            }
            // Calculando a media de cada aluno
            double media = soma / qtdNotas;
            // Saida de dados, nome:  media
            System.out.println(nomes[i] + " | Média: " + media);
        }

        scanner.close();
    }
}
