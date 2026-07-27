public class pivotelement {
    public static void main(String[] args){
        int nums[]={1,7,3,6,5,6};
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=0;
            for(int j=nums.length-1;j>i;j--){
                rightsum+=nums[j];
            }
            if(leftsum==rightsum){
                System.out.println("pivot element:"+i);
                return;
            }
            leftsum+=nums[i];
        } 
        System.out.println("no pivot element");
    }
}

