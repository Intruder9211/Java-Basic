import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        // write code here
        if(n%2!=0 && m%2!=0){
            System.out.println("we are odd");
        }
        else{
            System.out.println("we are simple");
        }
    }
}
