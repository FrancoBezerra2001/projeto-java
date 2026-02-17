import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1:  Continuar");
            System.out.println("2:  Sair");
            System.out.print("Escolha uma opção:  ");
            
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("\nDigite um número para ver a tabuada:  ");
                int numero = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Tabuada do " + numero + ": ");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }

                System.out.print("\nAgora,  escreva uma palavra ou uma frase:  ");
                String frase = scanner.nextLine();
                System.out.println("Frase digitada:  \"" + frase + "\"");
                
            } else if (opcao == 2) {
                System.out.println("\nObrigado por utilizar o nosso sistema,  espero que tenha gostado.");
            } else {
                System.out.println("\nOpção inválida! Tente 1 para continuar ou 2 para sair.");
                scanner.nextLine();
            }

        } while (opcao != 2); 

        scanner.close();
    }
}
