package lesson5;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculate("1 + 1"));
    }
    public static double calculate(String str) {
        String[] arr = str.split(" ");
        double result;
        switch (arr[1]) {
            case "+":
                result = Double.parseDouble(arr[0]) + Double.parseDouble(arr[2]);
                break;
            case "-":
                result =  Double.parseDouble(arr[0]) - Double.parseDouble(arr[2]);
                break;
                case "/":
                    result = Double.parseDouble(arr[0]) / Double.parseDouble(arr[2]);
                break;
                case "*":
                    result = Double.parseDouble(arr[0]) * Double.parseDouble(arr[2]);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + arr[1]);
        }
        return result;
    }
}
