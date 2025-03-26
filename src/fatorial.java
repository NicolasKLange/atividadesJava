import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Entrada de dados
        System.out.print("Informe um valor inteiro: ");
        int numero = scanner.nextInt();

        //Verifica se o numero é positivo
        if (numero < 0) {
            System.out.println("O valor  temque ser positivo!!");
        } else {
            // Se for calcularo fatorial com a função
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " e " + fatorial);
        }
        scanner.close();
    }

    // Função para calcular fatorial
    public static long calcularFatorial(int num) {
        long resultado = 1;

        // Multiplica o numero informado por ele mesmo até acabar
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
