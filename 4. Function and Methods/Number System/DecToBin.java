import java.util.Scanner;

public class DecToBin {
    public static int decToBin(int n) {
        int bin = 0;
        int pow = 0;
        while(n > 0) {
            int rem = n % 2;
            bin += (int) (rem*Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int binNumber = sc.nextInt();
        System.out.println("Binary of " + binNumber + " is " + decToBin(binNumber));
    }
}