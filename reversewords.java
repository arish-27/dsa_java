public class reversewords {
    public static void main(String[] args){
        String s="im so high";
        String word[]=s.trim().split("\\s+");
        int st=0;
        int end=word.length-1;
        while(st<end){
            String temp=word[st];
            word[st]=word[end];
            word[end]=temp;
            st++;
            end--;
        }
        for(String fina:word){
        System.out.println(fina);
        }
    }
}
