import java.util.Scanner;

public class wordcounttarget {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String target=sc.next();
        int i=0,j=0,count=0;
        while(i<str.length()){
            while(i<str.length() && j<target.length() &&str.charAt(i)==target.charAt(j)){
                i++;
                j++;
            }
            if(j==target.length()){
                if((i==target.length()||str.charAt(i-j-1)==' ') &&(i==str.length()|| str.charAt(i)==' ')){
                    count++;
                }
            }
            j=0;
            i++;
        }
       System.out.println(count); 
    }
    
}
