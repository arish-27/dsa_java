

public class deloitteadddigits {
    public static void main(String[] args) {
        deloitteadddigits obj=new deloitteadddigits();
        int result=obj.calculate(38);
        System.out.println(result);
    }
    public int calculate(int num){
        while(num>9){
            int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        num=sum;
    }
    return num;
    }
}
