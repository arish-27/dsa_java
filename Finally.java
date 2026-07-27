public class Finally {
    public static void main(String[] args) {
        int numbers[]={10,20,30};
        try {
            System.out.println(numbers[2]);
        } catch (Exception e) {
            System.out.println("there is no number in the array");
        }
        finally{
            System.out.println("program finished sucessfully");
        }
    }
}
