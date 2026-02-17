import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1: Continuar");
            System.out.println("2: Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer do teclado

            if (opcao == 1) {
                System.out.print("Digite uma palavra ou frase: ");
                String frase = leitor.nextLine();
                System.out.println("Você digitou: " + frase);
            } else if (opcao == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 2);

        leitor.close();
    }
}