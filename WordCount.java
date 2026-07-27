import java.util.*;
public class WordCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
            while(i<s.length() && s.charAt(i)!=' '){
                i++;
            }
        }
        System.out.println(count);
        fin(s);
    }
    public static void fin(String s){
        int cnt =0;
        for(int i = 0 ; i< s.length() ; i++){
            if(s.charAt(i) == ' '){
                cnt++;
            }
        }
                if(s.length()>0 ){
                    cnt++;
                }
        System.out.println(cnt);
    }
}
