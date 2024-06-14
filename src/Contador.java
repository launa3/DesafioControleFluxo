import java.util.Scanner;

/**
 * Classe onde tem a definição dos números de entrada e a chamada para a função
 * de contar
 */
public class Contador {
    public static void main(String[] args) {
        /** Pegando os valores através do terminal, utilizando a classe Scanner */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int param1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int param2 = scanner.nextInt();
        scanner.close();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        /**
         * Condição do método.
         * Caso o primeiro parâmetro seja maior que o segundo, é lançado o erro de volta
         * para quem chamou este método.
         */
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        } else {
            /** Subtração dos parâmetros, caso estejam de acordo com a condição */
            int contagem = param2 - param1;
            /**
             * Um laço de repetição de tamanho relacionado à subtração dos parâmetros e
             * imprimindo os números de forma incremental
             */
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        }
    }
}

/** Definição da exceção personalizada ParametrosInvalidosException */
class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o primeiro parâmetro é maior que o segundo.");
    }
}
