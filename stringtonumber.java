public class stringtonumber{
    public static void main(String[] args){
        String s1="123";
        String s2="123";
        intt(s1,s2);
        longg(s1,s2);
    }
    public static  void intt(String s1, String s2){
        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        int sum=num1+num2;
        System.out.println(sum);
    }
    public static void longg(String s1, String s2){
        long num1=Long.parseLong(s1);
        long num2=Long.parseLong(s2);
        long sum=num1+num2;
        System.out.println(sum);
 
    }
    
}