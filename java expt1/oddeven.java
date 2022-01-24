import java.util.*;
class oddeven{

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        num = sc.nextInt();
        if(num%2==0)
        System.out.println("The number "+num+" is even");
        else 
        System.out.println("The number "+num+" is odd");
      
    }
}