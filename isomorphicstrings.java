import java.util.Scanner;

public class isomorphicstrings {
    public static void main(String[] args){
        System.out.println("enter yor string S: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("enter yor string T: ");
        String t=sc.next();
        int [] map1=new int[256];
        int [] map2=new int[256];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map1[a]!=0 && map1[a]!=b || map2[b]!=0 && map2[b]!=a){
            System.out.println("false");
            return;
        }
      map1[a]=b;
        map2[b]=a;
        }
        
      System.out.println("true");
    }
    
}
