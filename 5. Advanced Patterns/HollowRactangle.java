import java.util.Scanner;

public class HollowRactangle {
    public static void hollowRactangle(int totrows, int totcols) {
        for(int i = 1; i <= totrows; i++) {
            for(int j = 1; j <= totcols; j++) {
                if(i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        hollowRactangle(rows, cols);
    }
}