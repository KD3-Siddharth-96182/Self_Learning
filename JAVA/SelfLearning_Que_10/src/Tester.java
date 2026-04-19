
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Tester {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.rangeClosed(1, 10);
        int sum = stream1.sum();
        System.out.println("Sum = " + sum);

        IntStream stream2 = IntStream.rangeClosed(1, 10);
        IntSummaryStatistics stats = stream2.summaryStatistics();

        System.out.println("Count = " + stats.getCount());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Max = " + stats.getMax());
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Sum = " + stats.getSum());
    }
}