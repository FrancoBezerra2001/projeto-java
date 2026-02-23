import java.util.Scanner;

class CadastroCarros {
    String nome;
    double preco;

    public CadastroCarros(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro: " + nome + " | Preço: R$ " + String.format("%.2f", preco);
    }
}

public class SistemaCarros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos carros deseja cadastrar (máximo 50)? ");
        int quantidade = leitor.nextInt();

        if (quantidade > 50 || quantidade <= 0) {
            System.out.println("Quantidade inválida. Ajustando para o limite permitido.");
            quantidade = (quantidade <= 0) ? 1 : 50;
        }

        // Changed from Carro[] to CadastroCarros[]
        CadastroCarros[] garagem = new CadastroCarros[quantidade];
        double somaPrecos = 0;

        for (int i = 0; i < quantidade; i++) {
            leitor.nextLine(); // Limpar o buffer do teclado
            System.out.println("\n--- Cadastro do " + (i + 1) + "º Carro ---");
            
            System.out.print("Nome do carro: ");
            String nome = leitor.nextLine();
            
            System.out.print("Preço do carro: ");
            double preco = leitor.nextDouble();

            // Changed from Carro to CadastroCarros
            garagem[i] = new CadastroCarros(nome, preco);
            somaPrecos += preco;
        }

        System.out.println("\n===============================");
        System.out.println("RELATÓRIO FINAL: ");
        System.out.println("===============================");
        
        for (CadastroCarros c : garagem) {
            System.out.println(c);
        }

        System.out.println("-------------------------------");
        System.out.println("Total de carros criados: " + quantidade);
        System.out.printf("Soma total dos preços: R$ %.2f\n", somaPrecos);
        
        leitor.close();
    }
}