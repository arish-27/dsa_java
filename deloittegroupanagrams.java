import java.util.*;
public class deloittegroupanagrams {
    public static void main(String[] args) {
        String arr[]={"ate","tan","tea","nat","eat","bat"};
        for(String str:arr){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedarray=new String(ch);
            System.out.print(sortedarray+" ");
        }
        
    }
}
