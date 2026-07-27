public class wiproreverseparticularwordinstring{
    public static void main(String[] args){
        String s="welcome to wipro arish";
        int k=3;
        String[] words=s.split(" ");
        String particularword=words[k-1];
        String rev="";
        for(int i=particularword.length()-1;i>=0;i--){
            rev+=particularword.charAt(i);
        }
        words[k-1]=rev;
        for(String str:words){
            System.out.print(str+" ");
        }
    }
}