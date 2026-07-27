public class Anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";
        cahr(s1,s2);
        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[ s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println("not anagram");
                return;
            }
        }

        System.out.println("anagram");
    }
    public static void cahr(String s1, String s2){
        int freq[] =new int[26];
        for(char ch:s1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            freq[ch-'a']--;
        }
        for(int num:freq){
            if(num!=0){
                System.out.println("not anagram");
                return;
            }

        }
        System.out.println("anagram");
    }
}
