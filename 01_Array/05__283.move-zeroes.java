
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int p = 0;
        int n = nums.length;

        if (nums.length == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = n - 1; i >=j; i--) {
            nums[i] =0;
        }
    }
}

