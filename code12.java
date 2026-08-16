public class code12 {
    public static void main(String[] args){
        int n=17;
        int original=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        int count1=0;
        for(int i=1;i<original;i++){
            if(original%i==0){
                count1++;
            }
        }
        int count2=0;
        for(int i=1;i<rev;i++){
            if(rev%i==0){
                count2++;
            }
        }
        if(count1==count2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
