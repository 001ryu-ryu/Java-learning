import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int number  = sc.nextInt();
        System.out.print("Reverse of " + number + " is: ");
        while(number > 0){
            int lastDigit = number % 10;
            
            System.out.print(lastDigit);
            
            number /= 10;
            
        }
        
        sc.close();
    }
    
}
