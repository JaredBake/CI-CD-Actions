import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator test = new Calculator();

        while (true) {
            String input = null;
            System.out.print("Enter command: ");
            if (scanner.hasNext()) {
                input = scanner.nextLine();
            }
            String[] tokens = input.split(" ");

            if (tokens[0].equalsIgnoreCase("quit")) {
                System.out.println("Exiting...");
                break;
            }
            switch (tokens[0]) {
                case "add":
                    System.out.println(test.add(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "subtract":
                    System.out.println(test.subtract(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "multiply":
                    System.out.println(test.multiply(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "divide":
                    System.out.println(test.divide(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2])));
                    break;
                case "binary":
                    System.out.println(test.intToBinaryNumber(Integer.parseInt(tokens[1])));
                    break;
                case "fibonacci":
                    System.out.println(test.fibonacciNumberFinder(Integer.parseInt(tokens[1])));
                    break;
                default:
                    System.out.println("Wrong command: Please type either 'add' 'subtract' 'multiply' 'divide' fibonacci' or 'binary'");
            }
        }
        scanner.close();
    }
}
