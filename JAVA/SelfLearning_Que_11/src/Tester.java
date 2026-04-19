
public class Tester {
    public static void main(String[] args) {
        Integer[] arr1 = {10, 5, 20, 3, 8};
        Double[] arr2 = {2.5, 7.1, 1.2, 9.8};

        System.out.println(min(arr1));
        System.out.println(min(arr2));
    }

    public static <T extends Number & Comparable<T>> T min(T[] arr) {
        T min = arr[0];
        for (T val : arr) {
            if (val.compareTo(min) < 0) {
                min = val;
            }
        }
        return min;
    }
}