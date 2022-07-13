package shilpa.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        String sa = sb.reverse().toString();
        return s.equals(sa);
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(121));
    }
}
