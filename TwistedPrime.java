public class TwistedPrime {
    public static boolean isPrime(int N){
        
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
    public static int reverse(int N){
        int rev=0;
        while(N!=0){
            rev = rev * 10 + N % 10;
            N = N / 10;
        }
        return rev;
    }
    public static void main(String []args){
        int N=11;
        int rev=reverse(N);
        if(isPrime(N) && isPrime(rev)){
            System.out.println("1");
        }else{
        System.out.println("0");
        }

    }
}
