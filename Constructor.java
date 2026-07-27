

public class Constructor {
    int rollno;
    String name;
   //Constructor(int rollno1,String name1)
   //{
     //   this.name=name1;
       // this.rollno=rollno1;
        // System.out.println("this is a constructor");
   // }
    void method(int s, String a){
        name=a;
        rollno=s;
    }
    public static void main(String[] args){
        Constructor obj = new Constructor();
        obj.method(27,"arish");
        System.out.println(obj.name);
        System.out.println(obj.rollno);
        
    }  
}
