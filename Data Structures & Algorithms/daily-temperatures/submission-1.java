class Solution {
    public int[] dailyTemperatures(int[] tm) {
        int[] r = new int[tm.length];
        int j=1;
        int i=0;
        int count=1;
        while(i<tm.length && j<tm.length)
        {
            int cu = tm[i];
            System.out.println(cu+" "+i+" "+j);
            if(tm[j]>cu)
            {
                r[i] = count;
                count = 1;
                i++;
                j=i+1;
                //System.out.println(cu+" "+i+" "+j);
            }
            else
            {
                count++;
                if(j<tm.length-1) 
                j++;
                else
                {i++;j=i+1;count=1;}
            }
            //System.out.println(i+" "+j);
        }
        return r;

        
    }
}
