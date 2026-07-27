public class validpalindrome {
    public static void main(String[] args){
        String s="A man, a plan, a canal: Panama";
        System.out.println(replacetype(s));
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                System.out.println("false");
                return;
            }
            left++;
            right--;
        }
        System.out.println("true");
    }
    public static boolean replacetype(String s){
        s=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
