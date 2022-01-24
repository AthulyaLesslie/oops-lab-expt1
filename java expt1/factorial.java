
import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        int n,i,f=1;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("factorial of "+n+" is:");
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(+f);

    }

}
