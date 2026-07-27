public class DifferenceInString {
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        System.out.println(CHararraysolving(s,t));
        int freq[]=new int[26];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']--;
        } 
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a'));
            }
        } 
    }
    public static char CHararraysolving(String s, String t){
        int freq[]=new int[26];
        for(char ch:t.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s.toCharArray()){
            freq[ch-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                return ((char)(i+'a'));
            }
        }
        return ' ';
    }
}

