public class code27{
    public static void main(String[] args){
        String s="A&x#";
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(!Character.isLetter(ch[i])){
                i++;
            }
            else if(!Character.isLetter(ch[j])){
                j--;
            }else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            
        }
        System.out.println(new String(ch));
    }
}