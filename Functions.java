
public class Functions {
    // Function with no parameters and no return value
    public static void greet() {
        System.out.println("Hello, World!");
    }
    
    // Function with parameters and no return value
    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    
    // Function with parameters and return value
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
    
    // Function with variable number of arguments
    public static int findMax(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    // Recursive function
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        greet();
        addNumbers(5, 10);
        int product = multiplyNumbers(3, 4);
        System.out.println("Product: " + product);
        int maxNumber = findMax(10, 5, 8, 12, 3);
        System.out.println("Max Number: " + maxNumber);
        int factorialResult = factorial(5);
        System.out.println("Factorial: " + factorialResult);
    }
}
