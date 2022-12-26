public class PalindromeNum {
    public static void main(String[] args) {
palindromeNum(121,0,0);
    }

    public static void palindromeNum(int num, int rev, int remainder) {
        int originalNumber = num;
        while (num != 0) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num /= 10;


        }
        if (originalNumber==rev)
        {
            System.out.println("num is palindrome");
        }
        else
        {
            System.out.println("it is not palindrome");
        }
    }
}
