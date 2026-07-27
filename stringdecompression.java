public class stringdecompression {
    public static void main(String[] args){
        String s="a4b2c1d4e5";
        String result="";
        for(int i=0;i<s.length();i+=2){
            char ch=s.charAt(i);
            int count=s.charAt(i+1)-'0';
            for(int j=0;j<count;j++){
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}
