//Write a method isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

public class Question2 {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(98));
    }
}