import java.util.Scanner;
public class ReverseANumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int rev = 0;
        while(number > 0){
            int lastDigit = number%10;
            rev = (rev * 10) + lastDigit;
            number = number/10;

            
        }
        System.out.println("Reverse of " + originalNumber + " is " + rev);
        sc.close();
    }
}
