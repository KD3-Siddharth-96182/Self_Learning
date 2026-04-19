import java.util.stream.IntStream;

public class Tester {
    public static void main(String[] args) {
        int n = 5;
        int sum = IntStream.rangeClosed(1, n).sum();
        System.out.println(sum);
    }
}