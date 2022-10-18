public class task4 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int beginning = 0;
        int end = s.length() - 1;
        char b, e;
        while (beginning <= end) {
            b = s.charAt(beginning);
            e = s.charAt(end);
            if (!Character.isLetterOrDigit(b)) {
                beginning++;
            } else if (!Character.isLetterOrDigit(e)) {
                end--;
            } else {
                if (Character.toLowerCase(b) != Character.toLowerCase(e)) {
                    return false;
                }
                beginning++;
                end--;
            }
        }

        return true;
    }
}
