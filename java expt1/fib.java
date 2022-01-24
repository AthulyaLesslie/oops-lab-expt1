import java.util.*;
class fib
{
    public static void main(String args[]) 
    {
        int a,sum,i,f=0,s=1;
        System.out.println("enter the number of elements");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("fibonnaci series:");
        System.out.println(f + "\n" + s);
        for(i=3;i<=a;i++)
        {
            sum=f+s;
            System.out.println(+sum);
            f=s;
            s=sum;
        }
    }
}
