public class question2 {
    public String repDuplicates(String s) {
        String str = s;
        System.out.println("-> "+s);
        while (true) {
            String next = rep(str);
            if (next.equals(str)) {
                break;
            }
            str = next;

        }
        return str;
    }

    private String rep(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        StringBuffer temp1 =new StringBuffer();
        String temp2 =null;
        while (i < n) {
            int j = i;
            char currentChar = s.charAt(i);
            while (j < n && s.charAt(j) == currentChar) {
                j++;
            }
            int count = j - i;
            if (count >= 3) {
                sb.append(s.charAt(i-1));
                temp2 = String.valueOf(s.charAt(i-1));
                for(int c=0;c<count;c++){
                    temp1.append(String.valueOf(currentChar));
                }
            } else {
                for (int k = i; k < j; k++) {
                    sb.append(currentChar);
                }
            }
            i = j;
        }
        if(temp2 != null){
            System.out.println("-> "+sb.toString()+","+temp1 +"  is replaced by "+temp2+" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "accbbbcd";
        question2 q = new question2();
        System.out.println("-> "+q.repDuplicates(s));
    }
}