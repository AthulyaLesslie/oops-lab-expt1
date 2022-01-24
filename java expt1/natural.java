import java.util.*;
class natural
{
    public static void main(String args[])
    {
        int n,sum=0,i;
        System.out.println("enter the number upto which the sum is to be found");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum is" + sum);
    }
}