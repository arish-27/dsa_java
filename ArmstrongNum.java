import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int digits=0;
        int sum=0;
        int t=n;
        while(t>0){
            digits++;
            t=t/10;
        }
        t=n;
        while(t>0){
            int d=t%10;
            sum+=Math.pow(d,digits);
            t=t/10;
        }
        if(temp==sum){
            System.out.println("it is armstrong");
        }else{
            System.out.println("not an armstrong");
        }
    }
}