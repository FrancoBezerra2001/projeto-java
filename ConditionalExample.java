public class ConditionalExample {
    public static void main(String[] args) {
        int age = 20;
        String message;

        // Estrutura condicional if-else
        if (age >= 18) {
            message = "Você é maior de idade.";
        } else {
            message = "Você é menor de idade.";
        }

        System.out.println(message);

        // Exemplo de switch case
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Domingo";
                break;
            case 2:
                dayName = "Segunda-feira";
                break;
            case 3:
                dayName = "Terça-feira";
                break;
            default:
                dayName = "Dia inválido";
                break;
        }

        System.out.println("Hoje é: " + dayName);
    }
}