public class deloitteclimbingstairs {
    public static void main(String[] args) {
        int n=5;
        int prev1=2;
        int prev2=1;
        int current=0;
        if(n==2) { 
            System.out.println(2);
            return;
        }
        if(n==1) {
            System.out.println(1);
            return;
        }
        for(int i=3;i<=n;i++){
            current=prev2+prev1;
            prev2=prev1;
            prev1=current;
        }
        System.out.println(current);
    }
}
