package com.company;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatedCharSubstring {
    public static void main(String[] args) {
//        String s = "abcdeddfghiijklmnj";
//        String s ="aab";
        String s = "abbbba";
        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        //abcdeddfghiijklmnj
        // startPointer
        // create  map of char vs position
        // create res
        // slide pointer to the position of repeated char
        // if char not found in map -- means we found non repeated char
        // if char found in map
        int startPos = 0;
        boolean duplicateChar = false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // found duplicate char
            if (map.containsKey(s.charAt(i))) {
                // length = endIndex - startIndex  -1;
                int curRes = (i - startPos);
                res = curRes > res ? curRes:res;
                startPos = startPos >map.get(s.charAt(i)) + 1? startPos: map.get(s.charAt(i)) + 1;
//                int start = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), startPos);
                duplicateChar = true;
            } else {
                map.put(s.charAt(i),i);
            }
        }
        int curRes = (s.length() - startPos);
        res = curRes > res ? curRes:res;
        if (!duplicateChar) {
            res = s.length();
        }
        System.out.println("res is : "+res);
        return res;
    }
}
