class argument {
    String name;
    int rollno;
    public void setvalues(String str,int num){
        name=str;
        rollno=num;
    }
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class argumentpass{
    public static void main(String[] args){
        argument appform=new argument();
        appform.setvalues("arish",27);
        appform.display();

        argument viewer=new argument();
        viewer.setvalues("viewer",72);
        viewer.display();
    }
}

    

