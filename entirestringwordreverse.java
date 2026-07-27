public class entirestringwordreverse {
    public static void main(String[] args) {
        String s= "arish kumar";
        reverseusingstringbuilder(s);
        char ch[]=s.toCharArray();
        int st=0;
        for(int i=0;i<=ch.length;i++){
        if(i==ch.length || ch[i]==' '){
            int end=i-1;
            while(st<end){
            int temp=ch[st];
            ch[st]=ch[end];
            ch[end]=(char)temp;
            st++;
            end--;
        }
        st=i+1;
        }
    }
        System.out.println(new String (ch));
    }
    
    public static void reverseusingstringbuilder(String s){
        String words[]=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);
            result.append(sb.reverse().append(" "));
        }
        System.out.println(result.toString().trim());
    }
}
