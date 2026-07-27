public class majorityelement {
    public static void main(String[] args) {
        majorityelement maj=new majorityelement();
        int nums[]={1,1,2,2,2,2,1,1,1,3,3,4,4,5,5,2,5,5};
        System.out.print(maj.element(nums));
        
        
    }
    public int element(int[] nums){
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(count==0){
                candidate = num;
            }
            if(num==candidate){
                count=count+1;
            }
            else{
                count=count-1;
            }
        }

        return candidate;
    }
}

