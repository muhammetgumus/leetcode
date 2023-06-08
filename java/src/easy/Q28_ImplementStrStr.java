package src.easy;

public class Q28_ImplementStrStr {
    public static void main(String[] args) {
        Q28_ImplementStrStr obj = new Q28_ImplementStrStr();
        System.out.println(obj.strStr("aaaaa",""));
    }
    public int strStr(String haystack, String needle) {
        if(haystack == "" || needle == "")
            return 0;
        return haystack.toLowerCase().indexOf(needle.toLowerCase());
    }
}
