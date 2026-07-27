import java.util.*;
public class validparanthesis {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String s="{[()]}";
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='(' || ch=='['){
            st.push(ch);
            }else{
                if(st.isEmpty()){
                    System.out.println("false");
                    return;
                }
                char top=st.pop();
                if(ch=='}' && top!='{' || ch==')' && top!='(' || ch==']' && top!='['){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println(st.isEmpty());
    }
}
