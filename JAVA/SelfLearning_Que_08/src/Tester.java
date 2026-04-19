

import java.util.Scanner;
import java.util.stream.LongStream;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long fact = LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
        System.out.println("Factorial = " + fact);
    }
}