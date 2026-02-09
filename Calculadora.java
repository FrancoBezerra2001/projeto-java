public class Calculadora {
    // Versão 1: Soma dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Versão 2: Soma três números inteiros (mudou a quantidade)
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Versão 3: Soma dois números decimais (mudou o tipo)
    public double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(5, 10));          // Chama Versão 1
        System.out.println(calc.somar(5, 10, 15));      // Chama Versão 2
        System.out.println(calc.somar(2.5, 4.3));       // Chama Versão 3
    }
}

