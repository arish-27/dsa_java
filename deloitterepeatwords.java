public class deloitterepeatwords {
    public static void main(String[] args) {
        String words[]={"guganesh5","arish7"};
        String result="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int count=0;
            String text="";
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(ch>='0' && ch<='9'){
                    count=ch-'0';   //char to nummber conversion
                }else{
                    text+=ch;
                }
            }
            for(int k=0;k<count;k++){
                result+=text;
            }
            if (i != words.length - 1) {
                result += " ";
            }
        }
        System.out.println(result);
    }
}
