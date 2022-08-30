package shilpa.leetcode;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
         while(columnNumber>26){
             int rem=(columnNumber-1)%26+65;
             columnNumber=(columnNumber-1)/26;
             char y=(char)rem;
             sb.append(y);
         }
          sb.append((char)(64+columnNumber));
          sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {

        int columnNum=701;
        String s = ExcelSheetColumnTitle.convertToTitle(columnNum);
        System.out.println(s);
    }
}
