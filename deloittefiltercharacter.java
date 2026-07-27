public class deloittefiltercharacter {
    public static void main(String[] args) {
        String target = "programming";
        String reference = "grm";
        String output = "";
        for (char ch:target.toCharArray()) {
            int found = 0;
            for (int j = 0; j < reference.length(); j++) {
                if (ch == reference.charAt(j)) {
                    found = 1;
                    break;
                }
            }
            if (found==0) {
                output += ch;
            }
        }
        System.out.println(output);
    }
}

