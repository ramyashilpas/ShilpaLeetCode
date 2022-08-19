package shilpa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
      List<List<Integer>> res=new ArrayList<>(numRows);
      if(numRows==1){
          res.add(new ArrayList<>(List.of(1)));
          return res;
      }
      if(numRows==2){
          res.add(new ArrayList<>(List.of(1)));
          res.add(new ArrayList<>(Arrays.asList(1,1)));
      }
      else {
          List<Integer> list=new ArrayList<>();
          list.add(1);
          res.add(list);
          list=new ArrayList<>();
          list.add(1);
          list.add(1);
          res.add(list);
          helper(res,numRows);
      }
      return res;
    }

    private static void helper(List<List<Integer>> res, int numRows) {
        int i=2;
        List<Integer> list = new ArrayList<>();
        while(i<numRows){
            list.add(1);
            for(int j=0;j<i-1;j++){
                list.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
            }
            list.add(1);
            res.add(list);
            list =new ArrayList<>();
            i++;
        }
    }

    public static void main(String[] args) {
        int numRows=4;
        List<List<Integer>> l=PascalsTriangle.generate(numRows);
            System.out.println(l);
    }
}

