import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("Digite um valor em reais: ");
        double value = scanner.nextDouble();

        System.out.println("Escolha o tipo de moeda para converter: ");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Libra");
        int option = scanner.nextInt();

        double convertedValue = 0;
        String symbol = "";

        switch (option) {
            case 1:
                convertedValue = controller.convertToDollar(value);
                symbol = "$";
                break;
            case 2:
                convertedValue = controller.convertToEuro(value);
                symbol = "€";
                break;
            case 3:
                convertedValue = controller.convertToLibra(value);
                symbol = "£";
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        System.out.println("Resultado da conversão: " + symbol + convertedValue);
    }
}