public class uniquestringcharacters {
    public static void main(String[] args) {
        uniquestringcharacters obj=new uniquestringcharacters();
        String s="abccde";
        obj.freqarray(s);
        char v[]=s.toLowerCase().toCharArray();
        for(int i=0;i<v.length-1;i++){
            for(int j=i+1;j<v.length;j++){
                if(v[i]==v[j]){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
        
    }
    public void freqarray(String s){
        s=s.toLowerCase();
        int freq[]=new int[26];
        int flag=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int count:freq){
            if(count>1){
                flag=1;
                System.out.println("false");
                
            }
        }
        if(flag==0)
        System.out.println("true");
    }
}
