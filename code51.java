public class code51 {
    public static void main(String[] args){
        String s="thequickbrownfoxjumpsoverthelazydog";
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
         for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                System.out.println(false);
            }
        }
            System.out.println(true);
    }
}
