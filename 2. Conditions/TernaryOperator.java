import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int number = sc.nextInt();
        String type = (number%2 == 0)? "even" : "odd";
        System.out.println(number + " is" + " " + type);
        sc.close();
    }
}
