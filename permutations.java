public class permutations {
    public static void main(String[] args){
        String s="abc";
        String t="bca";
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
        if(freq[i]!=0){
            System.out.println("not permutation");
            return;
        }
    }
    System.out.println("permutation");
    }
}
