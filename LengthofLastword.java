import java.util.*;
public class LengthofLastword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=sc.nextLine();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                count+=1;
            }
            else if(count>0){
                break;
            }
        }
        System.out.println(count);
    }
}
