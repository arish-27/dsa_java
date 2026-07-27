import java.util.*;
public class wordcountwipro {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        int count=0;
        for (String arr1 : arr) {
            if (arr1.length() > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
