import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {
        int x = 56765;
        System.out.println(palind(x));

        }

        public static boolean palind(int x) {
        String y = Integer.toString(x);

            if (y.length()==0) {
                return false;
            }

        for (int i = 0; i <y.length(); i++) {
            char start = y.charAt(i);
            char end = y.charAt(y.length()-1-i); // we use minus i because always the length -1 will be the same

            if (start != end) {
                return false;
            }
        }
            return true;
        }
}


