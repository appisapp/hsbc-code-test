public class question1 {
    public String removeDuplicates(String s) {
        String str = s;
        System.out.println("-> "+s);
        while (true) {
            String next = remove(str);
            if (next.length() == str.length()) {
                break;
            }
            str = next;
            System.out.println("-> "+next.toString());
        }
        return str;
    }

    private String remove(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int count = j - i;
            if (count < 3) {
                sb.append(s, i, j);
            }
            i = j;
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "accbbbcd";
        question1 q = new question1();
        q.removeDuplicates(s);

    }
}