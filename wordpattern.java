import java.util.*;
public class wordpattern {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat fish";
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String[] word=s.split(" ");
        if(word.length!=pattern.length()){
            System.out.println("false");
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String w=word[i];
            if (map1.containsKey(ch)&&!map1.get(ch).equals(w) || map2.containsKey(w)&&!map2.get(w).equals(ch)) {
                System.out.println("false");
                return;
            }
            map1.put(ch,w);
            map2.put(w,ch);
        }
        System.out.println("true");

    }
}
