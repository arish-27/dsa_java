public class duplicatewordstring {
    public static void main(String[] args) {
        String s="mamas";
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                System.out.println((char)(i+'a'));
            }
        }
    }
}
