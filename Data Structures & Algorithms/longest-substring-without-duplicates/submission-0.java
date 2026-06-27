class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        Set<Character> se = new HashSet<>();
        int i=0;
        int j=0;
        int co=0;
        while(j<c.length)
        {
            if(!se.contains(c[j]))
            {
                se.add(c[j]);
                co = Math.max(co, se.size());
                j++;
            }
            else
            {
             se.remove(c[i]);   
                i++;
            }
        }
        return co;
        
    }
}
