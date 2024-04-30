import java.util.Scanner;

public class SomePyr {
    public static void numberPyr(int totrows) {
        for(int i = 1; i <= totrows; i++) {
            for(int j = 1; j <= totrows-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        numberPyr(rows);
    }
}