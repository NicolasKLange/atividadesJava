import java.util.Scanner;

public class mediaAlunos {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Informe a quandidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        System.out.print("Infore a quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        String[]   nomes = new String[qtdAlunos];
        double[][] notas = new double[qtdAlunos][qtdNotas];


        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "° aluno: ");
            nomes[i] = scanner.next();

            double soma = 0; 

            for (int j = 0; j < qtdNotas; j++) {
                System.out.print("Informe a " + (j + 1) +"° nota de " + nomes[i] + ":  ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            scanner.nextLine();
        }
        System.out.println("****Media dos alunos ****");
        for (int i = 0; i < qtdAlunos; i++) {
            double soma = 0;
        
            for (int j = 0; j < qtdNotas; j++) {
                soma += notas[i][j];
            }

            double mediaAluno = soma / qtdNotas;
            System.out.println("Nome: " + nomes[i] + "| Média: " + mediaAluno);
        }
        scanner.close();
    }
}
