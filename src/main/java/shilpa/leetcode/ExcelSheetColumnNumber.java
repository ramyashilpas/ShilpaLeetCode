package shilpa.leetcode;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int i=Integer.parseInt(columnTitle);
      return i;
    }

    public static void main(String[] args) {
        String columnTitle="A";
        int i = ExcelSheetColumnNumber.titleToNumber(columnTitle);
        System.out.println(i);
    }
}
