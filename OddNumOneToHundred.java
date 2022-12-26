public class OddNumOneToHundred {
    public static void main(String[] args) {
        oddNumber(100);
    }

    public static void oddNumber(int num) {
        System.out.println("odd numbers from 1 to 100");
        for (int i = 1; i < num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
