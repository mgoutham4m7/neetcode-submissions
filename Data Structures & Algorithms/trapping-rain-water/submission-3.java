class Solution {
    public int trap(int[] height) {
        int n = height.length-1;
        List<Integer> lmax = new ArrayList<>(Collections.nCopies(n+1,0));
        lmax.set(0,height[0]);
        List<Integer> rmax = new ArrayList<>(Collections.nCopies(n+1,0));
        rmax.set(n,height[n]);
        int w = 0;
        for (int i=1;i<n;i++)
        {
            lmax.set(i,Math.max(lmax.get(i-1), height[i]));
        }
        for (int i=n-1;i>=0;i--)
        {
            rmax.set(i,Math.max(rmax.get(i+1), height[i]));
        }
        System.out.println(lmax);
        for(int i=0;i<n;i++)
        {
            w = w + Math.min(rmax.get(i),lmax.get(i)) - height[i];
        }
        return w;


        
    }
}
