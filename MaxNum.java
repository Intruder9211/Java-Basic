import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        int a,b;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter 1st no:");
        a=Sc.nextInt();
        System.out.println("enter 2nd no:");
        b=Sc.nextInt();
        if(a>b)
        System.out.println("max num="+a);
        else
        System.out.println("max number="+b);
    }
    
}
