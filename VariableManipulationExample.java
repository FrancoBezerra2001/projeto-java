public class VariableManipulationExample {
    public static void main(String[] args) {
        // Manipulação de Strings
        String original = "Hello, World!";
        String upper = original.toUpperCase();
        String lower = original.toLowerCase();
        String substring = original.substring(7, 12);

        System.out.println("Original: " + original);
        System.out.println("Upper case: " + upper);
        System.out.println("Lower case: " + lower);
        System.out.println("Substring: " + substring);

        // Operações aritméticas
        int a = 10;
        int b = 5;
        int sum = a + b;
        int product = a * b;
        double power = Math.pow(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Power: " + power);
    }
}