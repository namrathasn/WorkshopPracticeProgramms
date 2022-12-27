import java.util.Scanner;

public class StringFind {
    public static void main(String[] args) {
        System.out.println("enter the string and character");
        Scanner sc = new Scanner(System.in);
        findString(sc.next(), sc.next().charAt(0));


    }

    public static void findString(String str, char c) {
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==c)
            {
                System.out.println("charecter found");
                break;
            } else if (str.charAt(i)!=c) {
                System.out.println("not found");
                break;

            }



        }

    }


}






