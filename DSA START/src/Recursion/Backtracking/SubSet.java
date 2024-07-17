package Recursion.Backtracking;

public class SubSet {
    public static void FindSubSets (String str,   String ans, int i ) {
//        base
        if (i== str.length()) {
            System.out.println(ans);
            return;
        }

//        choice yes
        FindSubSets(str , ans+str.charAt(i), i+1);
//        NO
        FindSubSets(str, ans, i+1);
    }
    public static void main(String[] args) {
        FindSubSets("abc", "" , 0);
    }
}
