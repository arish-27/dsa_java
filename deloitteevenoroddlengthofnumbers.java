public class deloitteevenoroddlengthofnumbers {
    public static void main(String[] args) {
        int arr[]={123,4567,89,1001,22};
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;
            while(num>0){
                num/=10;
                count++;
            }
            if(count%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
