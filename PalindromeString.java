public class PalindromeString {
    public static void main(String[] args) {
        palindrome("namratha", "");

    }

    public static void palindrome(String str, String reverse) {
        int strLength = str.length();
        for (int i = (strLength-1); i >= 0; --i) {
            reverse = reverse + str.charAt(i);

        }
        System.out.println(reverse);
        if (str.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }

}
