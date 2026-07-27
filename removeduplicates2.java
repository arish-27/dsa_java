public class removeduplicates2 {
    public static void main(String[] args){
        int nums[]={1,1,1,1,1,2,2,2,2,2,3,3,3,3};
        int k=0;
        for(int n:nums){
            if(k<2 || n!=nums[k-2]){
                nums[k]=n;
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}