import java.util.*;
public class wiprotargetfindingstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String target=sc.next();
        String arr[]=str.split(" ");
        int count=0;
        for (String arr1 : arr) {
            if (arr1.equals(target)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
