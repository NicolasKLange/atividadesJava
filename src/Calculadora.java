import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        // Extanciando Scanner para coletade dados
        Scanner scanner = new Scanner(System.in);

        // Título da calculcadora
        System.out.println("***************");
        System.out.println("Calculadora!");

        // Entrada de dados, sendo dois valores para fazer o cálculo
        System.out.print("Informe o 1° valor: ");
        double valor1 = scanner.nextDouble();    
        System.out.print("Informe o 2° valor: ");
        double valor2 = scanner.nextDouble();
        
        // Entrada de dado, operação escolhida pelo usuário
        System.out.println("Informe a operação (A) Adição, (S) Subtração, (M) Multiplicação, (D) Divisão: ");
        // Armazenando a letra que o usuário informou, sendo convertida para maiuscula, 
        // coletando apenas o primeriro caracter
        char operacao = Character.toUpperCase(scanner.next().charAt(0));

        // Inicializando variavel resultado da operação
        double resultado;

        //  Switch Case para o verificar operação escolhidade pelo usuário
        switch (operacao) {
            // Resultado baseado na adição
            case 'A':
                resultado = valor1 + valor2;
                System.out.println("O resultado da adição é " + resultado);
                break;
                // Resultado baseado na subtração
                case 'S':
                resultado = valor1 - valor2;
                System.out.println("O resultado da subtração é " + resultado);
                break;
                // Resultado baseado na mutiplicação
                case 'M':
                resultado = valor1 * valor2;
                System.out.println("O resultado da multiplicação é " + resultado);
                break;
                // Resultado baseado na divisão
                case 'D':
                resultado = valor1 / valor2;
                System.out.println("O resultado da divisão é " + resultado);
                break;
            default:
                // Caso o usuário não informe a letra correspondida
                System.out.println("Informe a letra da operação correspondente!!");
                break;
        }
        // Fecha o scanner
        scanner.close();
    }
}
