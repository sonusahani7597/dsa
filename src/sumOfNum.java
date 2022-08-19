import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int ans= sum(a,b);
        System.out.println("Sum of the number is: "+ans);
    }

    static int sum(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
}
