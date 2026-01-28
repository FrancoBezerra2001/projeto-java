import java.util.Scanner;
public class UserInputDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá! Bem-vindo ao programa de entrada de dados.\n");

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

         System.out.print("Digite seu Estado Civil: ");
        String estadoCivil = scanner.next();    


        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        System.out.println("Seu CPF é " + cpf + ", seu peso é " + peso + " kg, sua altura é " + altura + " cm e seu estado civil é " + estadoCivil + ".");



        scanner.close();
    }
}