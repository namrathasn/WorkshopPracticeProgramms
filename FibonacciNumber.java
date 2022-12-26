public class FibonacciNumber {
    public static void main(String[] args) {
        fibonacci(7, 0, 1);
    }

    public static void fibonacci(int n, int first, int second) {
        System.out.println("fibonacci series till" + n + "terms");
        for (int i = 1; i < n; ++i) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;

        }
    }
}
