public class code16 {
    public static void main(String[] args){
        int arr[]={1,1,2,3,3,4,4,5,5,6,6};
        int sum=0;
        for(int num:arr){
            sum=sum^num;               //not operator used here: if two bits are same the output is 0
        }                                          // 0^0=0 //1^1=0 //1^0=1 //0^1=1
        System.out.println(sum);
    }
}
