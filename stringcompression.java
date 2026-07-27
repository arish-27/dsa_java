public class stringcompression {
    public static void main(String[] args) {
        String s="aaaabbbbccc";
        s=s.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                sb.append((char)(i+'a'));
                sb.append(freq[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
