import java.util.Scanner;

/* Write a java program to check if a number is palindrome in java. */

public class Question3 {
    public static void checkPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        if (rev == temp) {
            System.out.println(temp + " is palindrome");
        } else {
            System.out.println(temp + " is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for: ");
        int number = sc.nextInt();
        checkPalindrome(number);
    }
}
