package shilpa.leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        String s=strs[0];
        for(int i=1;i<strs.length;i++){
            while((strs[i].indexOf(s))!=0){
                s=s.substring(0,s.length()-1);
                if(s.isEmpty()) return "";
            }
        }
        return s;
    }
    public static void main(String[] args){
        String[] p={"flower","flow","flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(p));
    }
}
