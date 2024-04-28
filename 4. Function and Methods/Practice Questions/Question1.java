import java.util.Scanner;

//Write a Java method to compute the average of three numbers
public class Question1 {
    public static float avgOfNums(float a, float b, float c) {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println("Average of " + num1 + "," + num2 + " and " + num3 + " is " + avgOfNums(num1, num2, num3));
    }
}