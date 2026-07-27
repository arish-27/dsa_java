public class Missingnumber {
    public static void main(String[] args){
        int nums[]={1,0,3};
        int n=nums.length;
        int expsum=n*(n+1)/2;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        System.out.println(expsum-sum);
    }
}
