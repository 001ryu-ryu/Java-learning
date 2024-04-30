public class Butterfly {
    public static void butterfly(int n) {
        //1st half
        for(int i = 1; i <= n/2; i++ ) {
            //stars-> i
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            //spaces-> 2*(n/2-i)
            for(int j = 1; j <= 2*(n/2-i); j++ ) {
                System.out.print(' ');
            }
            // stars-> i
            for(int j = 1; j <= i; j++ ) {
                System.out.print('*');
            }
            System.out.println();
        }
        //2nd half
        for(int i = n/2; i >= 1; i-- ) {
            //stars-> i
            for(int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            //spaces-> 2*(n/2-i)
            for(int j = 1; j <= 2*(n/2-i); j++ ) {
                System.out.print(' ');
            }
            // stars-> i
            for(int j = 1; j <= i; j++ ) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(10);
    }
}