
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                candidate = nums[i];
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count1++;
            }
        }
        if (count1 > nums.length/2) {
            return candidate;
        }
        return -1;
    }
}

