public class code18 {
    public static void main(String[] args){
        String s="xxx";
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='x'){
                ch[i]='0';

                if(i+1<ch.length){
                    ch[i+1]='0';
                }
               
                if(i+2<ch.length){
                    ch[i+2]='0';
            }
                count++;
                i+=2;
                
            
            }
        }
        System.out.println(new String(ch));
        System.out.println(count);
    }
}
