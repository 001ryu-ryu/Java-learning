import java.util.Scanner;
public class Continue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter number: ");
            int number = sc.nextInt();
           
            if(number % 10 == 0){
                continue;
            }
            System.out.println("You entered " + number);
        } while(true);
    }
}
