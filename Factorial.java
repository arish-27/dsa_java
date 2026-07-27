import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        long n=sc.nextInt();
        long fact=1;
        for(long i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println((long)fact);
    }
}
