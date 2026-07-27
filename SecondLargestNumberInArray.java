public class SecondLargestNumberInArray {
    public static void main(String[] args){
        int nums[]={4,5,9,2,6};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>first){
                second=first;
                first=num;
            }else if(num>second && num!=first) {
                second=num;
            }
        }
        System.out.println(second);
    }
}
