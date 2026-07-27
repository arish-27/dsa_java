public class SpecialArrayReversal {
    public static void main(String[] args){
        String s="A&b";
        char[] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(!Character.isLetter(ch[left])){
                left++;
            }else if(!Character.isLetter(ch[right])){
                right--;
            }else{
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                right--;
                left++;
            }
        }
        System.out.println(new String(ch));
    }
}
