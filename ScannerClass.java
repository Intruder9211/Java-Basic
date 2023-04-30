//first program is for max number between 2 numbers


import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        int a,b,c;
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter 1st no:");
        a=Sc.nextInt();
        System.out.println("enter 2nd no:");
        b=Sc.nextInt();
        c=a+b;
        System.out.println("addition="+c);
    }
    
}