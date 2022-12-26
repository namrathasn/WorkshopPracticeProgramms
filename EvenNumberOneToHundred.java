public class EvenNumberOneToHundred {
    public static void main(String[] args) {
        evenNumber(100);
    }

    public static void evenNumber(int num) {
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
