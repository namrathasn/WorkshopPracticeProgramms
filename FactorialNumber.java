public class FactorialNumber {
    public static void main(String[] args) {
factorial(10,1);
    }
    public static void factorial(int num,long fact)
    {
        System.out.println("factorial of a given number are");
        for (int i=1;i<num;++i)
        {
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
