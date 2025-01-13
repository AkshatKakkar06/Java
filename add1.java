import java.util.Scanner;
class abc
{
    int sum(int n1, int n2)
    {
        return n1+n2;
    }
}
public class add1
{
    public static void main(String a[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = obj.nextInt();
        System.out.println("Enter the num2");
        int num2 = obj.nextInt();
        abc obj1 = new abc();
        int sum1 = obj1.sum(num1,num2);
        System.out.println(sum1);
    }
}