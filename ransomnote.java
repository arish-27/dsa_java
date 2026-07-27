import java.util.Scanner;
public class ransomnote{
    public static void main(String[] args){
        System.out.println("enter ransomnote elements: ");
        Scanner sc=new Scanner(System.in);
        String ransomnote=sc.nextLine();
        System.out.println("enter the magazine elements");
        String magazine=sc.nextLine();
        int[] freq=new int[26];
        for(char c:magazine.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:ransomnote.toCharArray()){
            freq[c-'a']--;
            if(freq[c-'a']<0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}