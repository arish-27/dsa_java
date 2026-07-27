import java.util.Scanner;
public class indexoffirstocurenceinstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of haystack");
        String haystack=sc.next();
        System.out.println("Enter the length of needle");
        String needle=sc.next();
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=0;
                int k=i;
                while(j<needle.length() && k<haystack.length() && needle.charAt(j)==haystack.charAt(k)){
                    j++;
                    k++;
                    if(j==needle.length()){
                        System.out.println(i);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}