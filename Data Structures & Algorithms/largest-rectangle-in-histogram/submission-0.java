class Solution {
    public int largestRectangleArea(int[] height) {
        int mx=0;
        for(int i=0;i<height.length;i++)
        {
            int j=i+1;
            int ri=0;
            int lf=0;
            while(j<height.length)
            {
                if(height[j]>=height[i])
                {
                    ri++;
                }
                else
                {
                    break;
                }
                j++;
            }
            int k=i;
            while(k>0)
            {
                if(height[k-1]>=height[i])
                {
                    lf++;
                }
                else
                {
                    break;
                }
                k--;
            }
            //System.out.println(ri*height[i]+lf*height[i]+height[i]);
            mx=Math.max(mx, ri*height[i]+lf*height[i]+height[i]);
            
        }
        return mx;
        
    }
}
