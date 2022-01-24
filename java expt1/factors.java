import java.util.*;
class factors
{
    public static void main(String args[])
    {
        int a,i;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
           if(a%i==0)
           System.out.println(i); 
        }

    }  
}
    