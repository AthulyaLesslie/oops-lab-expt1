import java.util.*;
class prime{
    public static void main(String args[])
    {
        int a,i,b=1;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                b=0;
                break;
            }
        }
        if(b==0)
        System.out.println("The number "+a+" is not prime");
        else 
        System.out.println("The number "+a+" is prime");

    }

}
    