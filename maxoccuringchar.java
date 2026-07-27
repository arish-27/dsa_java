public class maxoccuringchar {
    public static void main(String[] args){
        String s="programming"; 
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        } 
        int max=0;
        char result=0;
        for(int i=0;i<s.length();i++){
            int count=freq[s.charAt(i)-'a'];
            if(count>=max){
                max=count;
                result=s.charAt(i);
            }
        } 
        System.out.println(max);
        System.out.println(result);
    }
}
