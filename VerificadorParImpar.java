public class VerificadorParImpar {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 11, 14, 17, 20};

        System.out.println("--- Analisando os números ---");

        for (int n : numeros) {
            // Se o resto da divisão por 2 for ZERO, o número é PAR
            if (n % 2 == 0) {
                System.out.println("O número " + n + " é PAR.");
            } else {
                System.out.println("O número " + n + " é ÍMPAR.");
            }
        }
    }
}