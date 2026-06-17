class Solution {
    public int trap(int[] height) {
        int[] leftMx = new int[height.length];
        int[] rightMx = new int[height.length];
        leftMx[0] = height[0];
        int s=0;

        for(int i=1;i<height.length;i++)
        {
            leftMx[i] = (Math.max(leftMx[i-1],height[i]));
        }
        rightMx[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>0;i--)
        {
            rightMx[i] = (Math.max(rightMx[i+1],height[i]));
        }
        for(int i=1;i<height.length;i++)
        {
            
            s+=Math.min(leftMx[i],rightMx[i])-height[i];
            System.out.print(s);
        }
        System.out.println(leftMx+" "+ rightMx);
        return s;


        
    }
}
