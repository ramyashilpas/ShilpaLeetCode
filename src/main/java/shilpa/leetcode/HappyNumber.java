package shilpa.leetcode;

import java.util.ArrayList;

public class HappyNumber {
    public static boolean isHappy(int n) {
        ArrayList a=new ArrayList<>();
        while(n!=1){
            int sum=0;
           while(n!=0){
               sum+=(int)Math.pow(n%10,2);
               n/=10;
           }
           n=sum;
           if(a.contains(n)){
               return false;
            }
          a.add(n);
        }
       return true;
    }

    public static void main(String[] args) {
        int n=19;
        boolean happy = HappyNumber.isHappy(n);
        System.out.println(happy);
    }
}
