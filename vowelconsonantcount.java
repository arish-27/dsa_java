public class vowelconsonantcount {
    public static void main(String[] args){
        String s="Arish1";
        int consonantcount=0;
        int vowelcount=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){   
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelcount++;
            }else{
                consonantcount++;
            }
        }
        }
        System.out.println("vowelcount: "+vowelcount+" "+"consonantcount: "+consonantcount);
    }
}
