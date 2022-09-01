package shilpa.leetcode;


public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        if(columnTitle.length()==0){
            return 0;
        }
        int sum=0;
      for(int i=0;i<columnTitle.length();i++){
          sum*=26;
          sum+= (columnTitle.charAt(i)-64);
      }
      return sum;
    }

    public static void main(String[] args) {
        String columnTitle="ZY";
        int i = ExcelSheetColumnNumber.titleToNumber(columnTitle);
        System.out.println(i);
    }
}
