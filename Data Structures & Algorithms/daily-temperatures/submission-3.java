class Solution {
    public int[] dailyTemperatures(int[] t) {
        int i=0;
        int j=1;
        int[] res = new int[t.length];
        int c=1;
        while(j>i && j<t.length)
        {
            if(t[j]>t[i])
            {
                res[i] = c;
                i++;
                c=0;
                j=i+1;
            }
            
            else
            {
                j++;
                if (j >= t.length)
                {
                    i++;
                    j=i+1;
                    c=0;
                }
            }
            c++;
        }
        return res;
        
    }
}
