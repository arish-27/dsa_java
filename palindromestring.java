import java.util.Scanner;
public class palindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string name:");
        String s=sc.next();
        int i=0;
        int j=s.length()-1;
        while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            System.out.println("not palindrome");
            return;
        }
        i++;
        j--;
    }
        System.out.println("palindrome");
    }
}
