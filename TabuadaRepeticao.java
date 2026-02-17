import java.util.Scanner;

public class TabuadaRepeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = leitor.nextInt();
        
        int contador = 1; 
        
        System.out.println("\nTabuada do " + numero + ":");
        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++; 
        }
        
        leitor.close();
    }
}