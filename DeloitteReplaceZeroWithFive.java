public class DeloitteReplaceZeroWithFive {
    public static void main(String[] args) {
        int n=1020;
        int place=1;
        int result=0;
        while(n>0){
            int digit=n%10;
            if(digit==0){
                digit=5;
            }
        result=digit*place+result;
        place=place*10;
        n/=10;
        }
        System.out.println(result);
    }
}
