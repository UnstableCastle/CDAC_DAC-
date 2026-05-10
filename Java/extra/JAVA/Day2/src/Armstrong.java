import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, digits = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }

        originalNumber = number;

       
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

       
        return result == number;
    }
}