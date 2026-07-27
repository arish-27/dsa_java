import java.util.Scanner;

public class fibonaaciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=1;
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<n;i++){
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
    
}
