class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int res = nums[0];
        while (high >= low) {
            if (nums[low]>nums[high]){
                res = Math.min(res,nums[high]);
                high--;
            }
            else
            {
                break;
            }
        }
        return res;
    }
}
