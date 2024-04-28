import java.util.Scanner;

public class PrimInRange {
    public static void primeInRange(int r1, int r2) {
        for(int i = r1; i <= r2; i++) {
            boolean isPrime = true;
            if(i <= 1) {
                isPrime = false;
            } else {
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first range: ");
        int range1 = sc.nextInt();
        System.out.print("Enter the second range: ");
        int range2 = sc.nextInt();
        if(range1 < 0 || range2 < 0) {
            System.out.println("Enter valid range(+ve) and run the program again!!");
        } else {
            System.out.println("Prime numbers between " + range1 + " and " + range2 + " are: ");
            primeInRange(range1, range2);
        }

    }
}