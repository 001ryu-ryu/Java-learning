import java.util.Scanner;

public class InvHPyr {
    public static void invertedHalfPyramid(int totrows) {
        //for lines outer loop
        for(int i= 1; i <= totrows; i++) {
            //for spaces
            for(int j = 1; j <= totrows-i; j++) {
                System.out.print(' ');
            }
            //for stars
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        invertedHalfPyramid(rows);
    }
}