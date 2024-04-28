/* Write a java method to compute the sum of the digits in an integer */

import java.util.Scanner;

public class Question4 {
    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Sum of digits of " + number + " is " + sum(number));
    }
}