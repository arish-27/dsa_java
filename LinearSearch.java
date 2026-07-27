public class LinearSearch {
    public static void main(String[] args) {
        int nums[]={9,4,7,2,5};
       int key=7;
       int found=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==key){
               found=1;
               System.out.println("Index of the key is: "+i);
           }
       }
       if(found==0)
       System.out.println("element not found");

    }
}
