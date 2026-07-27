import java.util.*;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        max=a;
        if(b>max){
            max=b; 
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}
