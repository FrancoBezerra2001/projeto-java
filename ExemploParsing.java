public class ExemploParsing {
    public static void main(String[] args) {
        String textoPreco = "150.50";
        String textoIdade = "25";

        // 1. Convertendo String para double
        double preco = Double.parseDouble(textoPreco);

        // 2. Convertendo String para int
        int idade = Integer.parseInt(textoIdade);

        // Agora podemos fazer cálculos matemáticos
        double novoPreco = preco + 10.00;

        System.out.println("Idade convertida: " + idade);
        System.out.println("Preço com acréscimo: R$ " + novoPreco);
    }
}
    

