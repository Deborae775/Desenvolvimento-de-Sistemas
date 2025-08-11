package verificanumero;

import java.util.Scanner;

public class Verificanumero {

    public static void main(String[] args) {
        int dado = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite um número para continuar (Para sair digite 0 ou negativo): ");
            dado = teclado.nextInt();

            if (dado > 0) {
                if (dado % 2 == 0) {
                    System.out.println("O número digitado é (PAR): " + dado);
                } else {
                    System.out.println("O número digitado é (ÍMPAR): " + dado);
                }

                boolean primo = true;

                if (dado == 1) {
                    primo = false;
                } else {
                    for (int i = 2; i < dado; i++) {
                        if (dado % i == 0) {
                            primo = false;
                            break;
                        }
                    }
                }

                if (primo) {
                    System.out.println("O número digitado (É PRIMO).");
                } else {
                    System.out.println("O número digitado (NÃO É PRIMO).");
                }

                System.out.println(); 
            }

        } while (dado > 0);

        System.out.println("Programa encerrado.");
        teclado.close();
    }
}
