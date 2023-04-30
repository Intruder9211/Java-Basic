import java.util.Scanner.*;

public class MaxNum3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter 1st no:");
        a=Sc.nextInt();
        System.out.println("enter 2nd no:");
        b=Sc.nextInt();
        System.out.println("enter 3rd no:");
        c=Sc.nextInt();
        if (a>b && a>c) 
        System.out.println("max num="+a);
        else if(b>a && b>c)
        System.out.println("max num="+b);
        else
        System.out.println("max num="+c);
            
    }
    
}
