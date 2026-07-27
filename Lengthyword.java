import java.util.Scanner;

public class Lengthyword {
    public static void main(String[] args){
        System.out.println("enter your string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        String currentword="";
        String longestword="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
               currentword=currentword+ch;
            }else{
                if(currentword.length()>longestword.length()){
                    longestword=currentword;
                }
                currentword="";
            }
        }
        if(currentword.length()>longestword.length()){
                    longestword=currentword;
                }
                System.out.println("the longest word is: "+longestword);
    }
    
}
