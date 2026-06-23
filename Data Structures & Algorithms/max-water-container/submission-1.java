class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r = heights.length-1;
        int res = 0;
        int water = 0;
        while(r>l)
        {
             water = (r-l)*Math.min(heights[r],heights[l]);
            if (heights[r]>heights[l])
            {
                l++;
            }
            else
            {
                r--;
            }
            res = Math.max(water,res);
        }
        return res;
    }
}
