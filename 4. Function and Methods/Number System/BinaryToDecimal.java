import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(int n) {
        int dec = 0;
        int pow = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            dec += (int) (lastDigit * Math.pow(2, pow));
            pow++;
            n /= 10;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binNumber = sc.nextInt();
        System.out.println("Decimal of " + binNumber + " is " + binaryToDecimal(binNumber));
    }
}