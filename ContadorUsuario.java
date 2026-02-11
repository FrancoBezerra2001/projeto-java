import java.util.Scanner;

public class ContadorUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite um número positivo: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("O número precisa ser positivo!");
        } else {
            
            System.out.println("\nContagem Crescente:");
            for (int i = 0; i <= n; i++) {
                System.out.print(i + " ");
            }

            
            System.out.println("\n\nContagem Decrescente:");
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }

    
            System.out.println("\n\nResultado do Nome:");
            if (nome.length() > 6) {
                for (int i = 0; i < n; i++) {
                    System.out.println(nome);
                }
            } else {
                System.out.println(nome);
            }
        }

        scanner.close();
    }
}