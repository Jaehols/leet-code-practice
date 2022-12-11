import java.util.Locale;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll( "[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        Integer pointer1 = 0;
        Integer pointer2 = s.length()-1;

        while (pointer1<pointer2) {
            if (s.charAt(pointer1) != s.charAt(pointer2)){
                return false;
            }
            pointer1++;
            pointer2--;
        }

        return true;
    }

    public boolean isPalindromeSolution(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}
