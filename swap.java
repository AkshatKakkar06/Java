import java.util.Scanner;
public class swap
{
    static void swapnum(int m,int n)
    {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("The swapped value of m is "+m +" and of n is "+n);
    }
    public static void main(String a[])
    {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of m:");
    int m = obj.nextInt();
    System.out.println("Enter the value of n:");
    int n = obj.nextInt();
    swapnum(m,n);
    }
}