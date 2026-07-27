public class deloitteLexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        String s="abca";
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                char smaller=(char) Math.min(arr[left],arr[right]);
                arr[right]=smaller;
                arr[left]=smaller;
            }
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}
