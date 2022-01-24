import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int a,r,org,rev=0;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        org=a;
        while(a>0)
        {
            r=a%10;
            rev=(rev*10)+r;
            a=a/10;
        }
        if(org==rev)
        System.out.println("palindrome");
        else 
        System.out.println("not palindrome");
    }
}