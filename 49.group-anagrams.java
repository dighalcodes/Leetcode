/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for (String s : strs) {
            int[] c = new int[26];
            for (char ch : s.toCharArray())
                c[ch - 'a']++;
            m.computeIfAbsent(Arrays.toString(c), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
// @lc code=end
