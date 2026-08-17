public class code24 {
    public static void main(String[] args){
        int n=-121;
        int og=Math.abs(n);
        int temp=og;
        int rev=0;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        if(og==rev){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
