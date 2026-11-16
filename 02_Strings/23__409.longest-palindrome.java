/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for(char ch:s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

        int result = 0;
        boolean oddfreq = false;

        for(Character ch: mp.keySet()){
            if(mp.get(ch)%2==0){
                result+=mp.get(ch);
            }else{
                result+=mp.get(ch)-1;
                oddfreq=true;
            }
        }
        if(oddfreq){
            result++;
        }
        return result;
    }
}
// @lc code=end

