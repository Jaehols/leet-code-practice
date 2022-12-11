// 242 Valid Anagram
//https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> t_map = new HashMap<Character, Integer>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if (s.length() != t.length()) {
            return false;
        }

        for(char c : sArray) {
            if (s_map.containsKey(c)) {
                s_map.put(c, s_map.get(c) + 1);
            } else {
                s_map.put(c, 1);
            }
        }

        for(char c : tArray) {
            if (t_map.containsKey(c)) {
                t_map.put(c, t_map.get(c) + 1);
            } else {
                t_map.put(c, 1);
            }
        }

        if (t_map.equals(s_map)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAnagramSolution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for (int n: letters) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "tat";

        System.out.println(isAnagram(s,t));
    }
}
