import java.util.*;
public class wiprooddorevensum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        int even=0;
        int odd=0;
        while(num>0){
            int digit=(int) num%10;
            if(digit%2==0){
                even+=digit;
            }else{
                odd+=digit;
            }
            num/=10;
        }
        System.out.println(odd-even);
    }
}
