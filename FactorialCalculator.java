import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        
        if (number < 0) {
            System.out.println("Invalid input! Please enter a non-negative integer.");
        } else {
            
            System.out.println("The factorial of " + number + " is: " + factorial(number));
        }
        
        scanner.close();
    }

   
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
