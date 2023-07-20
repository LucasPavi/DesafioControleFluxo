import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        terminal.close();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println("O primeiro parâmetro deve ser menor do que o segundo parâmetro.");

        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroDois < parametroUm) {

            throw new ParametrosInvalidosException();

        } else {

            int contagem = parametroDois - parametroUm;
            int i;

            for (i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));

            }

        }
    }
}