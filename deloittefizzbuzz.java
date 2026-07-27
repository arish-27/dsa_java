import java.util.*;
public class deloittefizzbuzz {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
        int n=25;
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0){
                ans.add("fizzbuzz");
            }
            else if(i%3==0){
                ans.add("fizz");
            }
            else if(i%5==0){
                ans.add("buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        System.out.println(ans);
    }
}
