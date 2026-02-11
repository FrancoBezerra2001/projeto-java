import java.util.Scanner;

public class ExemploLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Digite números para somar. Digite 0 para sair.");

        do {
            System.out.print("Digite um número: ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("A soma total é: " + sum);
        scanner.close();
    }
}