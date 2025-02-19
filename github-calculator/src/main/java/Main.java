import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator test = new Calculator();

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            if (tokens[0].equalsIgnoreCase("quit")) {
                System.out.println("Exiting...");
                break;
            }
            switch (args[1]) {
                case "add":
                    test.add(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
                    break;
                case "subtract":
                    test.subtract(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
                    break;
                case "multiply":
                    test.multiply(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
                    break;
                case "divide":
                    test.divide(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
                    break;
                case "binary":
                    test.intToBinaryNumber(Integer.parseInt(args[2]));
                    break;
                case "fibonacci":
                    test.fibonacciNumberFinder(Integer.parseInt(args[2]));
                    break;
                default:
                    System.out.println("Wrong command: Please type either 'add' 'subtract' 'multiply' 'divide' fibonacci' or 'binary'");
            }
        }
        scanner.close();
    }
}
