public class productofarrayexceptitself {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int leftproduct[]=new int[nums.length];
        int rightproduct[]=new  int[nums.length];
        leftproduct[0]=1;
        rightproduct[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            leftproduct[i]=leftproduct[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rightproduct[i]=rightproduct[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=rightproduct[i]*leftproduct[i];
        }
        for(int arr:nums){
        System.out.println(arr);
        }
    }
}
