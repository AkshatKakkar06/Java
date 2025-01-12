class abc
{
    int sum(int n1, int n2)
    {
        return n1+n2;
    }
}
public class add
{
    public static void main(String a[])
    {
        abc obj = new abc();
        int sum1 = obj.sum(10,20);
        System.out.println(sum1);
    }
}