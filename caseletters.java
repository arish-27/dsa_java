import java.util.*;
public class caseletters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int upper=0;
        int lower=0;
        int found=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' || ch<='Z'){
                upper++;
            }else if(ch>='a' || ch<='z'){
                lower++;
            }
        }
        if(upper==s.length()){
            found=1;
            System.out.println(true);
        }
        if(lower==s.length()){
            found=1;
            System.out.println(true);
        }
        
        if((s.charAt(0)>='A' && s.charAt(0)<='Z')&&(lower==s.length()-1)){
            found=1;
            System.out.println(true);
            
        }
        if(found==0){
        System.out.println(false);
        }
    }
}