import java.util.Scanner;
public class Break1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            if(number%10 == 0){
                break;
            }
            // System.out.println(number);
        } while(true);
        System.out.println("You entered a number which is multiple of 10");
        sc.close();
    }
}
