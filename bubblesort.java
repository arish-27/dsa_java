public class bubblesort {
    public static void main(String[] args){
        int nums[]={3,4,2,6,7,9};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int arr:nums){
        System.out.print(arr+" ");
        }
    }
}
