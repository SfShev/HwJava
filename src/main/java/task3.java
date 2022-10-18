public class task3 {
    public String reverseWords(String s) {
        s = s.trim().replaceAll(" +", " ");
        ;
        StringBuilder rsb = new StringBuilder();
        StringBuilder ssb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != ' ') {
                ssb.append(currentChar);
            } else {
                rsb.insert(0, currentChar + ssb.toString());
                ssb.setLength(0);
            }
        }
        return rsb.insert(0, ssb.toString()).toString();
    }
}


