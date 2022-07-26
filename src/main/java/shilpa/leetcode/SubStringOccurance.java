package shilpa.leetcode;

public class SubStringOccurance {
    public int strStr(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        if(!(needle.isEmpty())){
            return i;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        SubStringOccurance s=new SubStringOccurance();
        int i= s.strStr("hello", "ll");
        System.out.printf(String.valueOf(i));
    }
}
