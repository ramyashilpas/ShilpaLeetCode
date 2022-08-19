package shilpa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RowIndexOfPascalsTriangle {
    public static List<Integer> getRow(int rowIndex) {
     List<Integer> list=new ArrayList<>();
     list.add(1);
     long res=1;
     for(int i=0;i<rowIndex;i++){
         res=(res*(rowIndex-i));
         res=(res/(i+1));
         list.add((int) res);
     }
     return list;
    }

    public static void main(String[] args) {
      List<Integer> l=  RowIndexOfPascalsTriangle.getRow(3);
        System.out.println(l);
    }
}
