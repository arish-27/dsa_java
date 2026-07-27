class Main{
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class Oop{
    public static void main(String[] args){
        Main appform=new Main();
        appform.name="arish";
        appform.rollno=27;
        appform.display();

        Main viewer=new Main();
        viewer.name="viewer";
        viewer.rollno=78374;
        viewer.display();
    }
}
