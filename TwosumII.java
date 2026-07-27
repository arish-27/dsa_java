public class TwosumII{
    public static void main(String[] args) {
        int nums[]={2,4,7,8};
        int target=9;
        int i=0;
        int k=nums.length-1;
        int found=0;
            while(i<k){
                int sum=nums[i]+nums[k];
                if(sum>target){
                    k--;
                }else if(sum<target){
                    i++;
                }else{
                    found=1;
                    System.out.println("Indices: "+(i+1)+  "," +(k+1));
                    break;
                }
            }
        if(found==0){
        System.out.println("Element Not Found");
        }
    }
}
