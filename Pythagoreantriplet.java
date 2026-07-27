import java.util.*;
public class Pythagoreantriplet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=(int) Math.sqrt(a*a+b*b);
        System.out.println(c);
    }
}
