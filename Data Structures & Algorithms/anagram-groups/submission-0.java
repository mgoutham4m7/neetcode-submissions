class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer,String> m = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            m.put(i,strs[i]);
        }
        String[] sortedStrs = so(strs);
        List<List<String>> r = new ArrayList<List<String>>();
        for(int i=0;i<sortedStrs.length;i++)
        {
            List<String> a = new ArrayList<>();
            if(m.get(i)!=null)
            {
            a.add(m.get(i));
            
            for(int j=i+1;j<sortedStrs.length;j++)
            {
                if(sortedStrs[i].equals(sortedStrs[j]))
                {
                    a.add(m.get(j));
                    m.remove(j);
                }
            }
            r.add(a);
            System.out.println(r);
            }
        }
        return r;
    }
    public String[] so(String[] strs)
    {
        for(int i=0;i<strs.length;i++)
        {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            strs[i] = new String(c);
        }
        return strs;
    }
}
