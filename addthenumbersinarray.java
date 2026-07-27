public class addthenumbersinarray{
    public static void main(String[] args) {
        int arr[]={12,345,4,22};
        for(int num:arr){
            int add=0;
            while(num>0){
                int digit=num%10;
                add+=digit;
                num/=10;
            }
            System.out.print(add+" ");
        }
    }
}