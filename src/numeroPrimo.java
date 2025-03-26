import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se numero é primo com a função
        if (numPrimo(numero)) {
            System.out.println(numero + " e um numero primo");
        } else {
            System.out.println(numero + " nao e um numero primo");
        }

        scanner.close();
    }

    //Método para verificar se número é primo
    public static boolean numPrimo(int num) {
        //Se for um numero menor ou igual a 1, não é primo
        if (num <= 1) {
            return false;
        } 
        // Verifica a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            // Sefor divisilpor algum numero alem de 1 e ele mesmo, não é primo
            if (num % i == 0) {
                return false;
            }
        }
        // Se não encontrou nenhum divisor  o numeroé primo
        return true;
    }   
}
