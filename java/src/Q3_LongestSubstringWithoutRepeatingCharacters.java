package src;

import java.util.HashSet;

public class Q3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("abcadb"));
    }

    public static int lengthOfLongestSubstring(String input) {
        if (input.length() == 0) {
            return 0;
        }
        int i = 0, j = 0, max = 0;
        HashSet<Character> chSet = new HashSet<>();
        while (j < input.length()) {
            if (!chSet.contains(input.charAt(j))) {
                chSet.add(input.charAt(j++));
                max = Math.max(max, chSet.size());
            } else {
                chSet.remove(input.charAt(i++));
            }
        }
        return max;
    }
}
