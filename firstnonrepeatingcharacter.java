import java.util.Scanner;
public class firstnonrepeatingcharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println("non repeating characters in the given string");
    }
}
