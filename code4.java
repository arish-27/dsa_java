public class code4 {
    public static void main(String[] args){
        int arr[]={2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int amount=2456;
        int count=0;
        for(int num:arr){
            count=amount/num;
            if(count>0){
                System.out.println(num+": "+count);
                amount=amount%num;
            }
        }
    }
}
