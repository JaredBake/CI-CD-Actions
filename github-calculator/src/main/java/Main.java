public class Main {
    public static void main(String[] args){
        System.out.println("entered main.java");
        Calculator test = new Calculator();
        while (!args[1].equals("quit")) {
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
    }
}
