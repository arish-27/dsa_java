import java.util.*;
public class countvowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
