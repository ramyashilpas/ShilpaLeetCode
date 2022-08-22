package shilpa.leetcode;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
      boolean b=false;
       StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        StringTokenizer regex=new StringTokenizer(s);
        String delimeter= Arrays.toString(new String[]{",", ".", """
""", ":", " ", "{", "}","'" });
        regex.nextToken(delimeter);
        s=s.replaceAll(delimeter,"");
        sb.append(s);
        if(s.equalsIgnoreCase(String.valueOf(sb.reverse()))){
          b=true;
      }
      return b;
    }

    public static void main(String[] args) {
       String s="A man, a plan, a canal: Panama";
       // String s="race a car";
        boolean b=ValidPalindrome.isPalindrome(s);
        System.out.println(b);
    }
}
