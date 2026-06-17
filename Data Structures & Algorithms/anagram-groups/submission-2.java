class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //using hashmap

        Map<String,ArrayList<String>> m = new HashMap<String,ArrayList<String>>();
        for(int i=0;i<strs.length;i++)
        {
            String k = generateKey(strs[i]);
        
            if(m.get(k)!=null)
            {
                m.get(k).add(strs[i]);
            }
            else
            {
                ArrayList<String> t = new ArrayList<String>(); 
                t.add(strs[i]);
                m.put(k,t);
            }
            System.out.println(m);
        }
        return m.values().stream().collect(Collectors.toList());
    }
    
    public String generateKey(String l)
    {
        int[] count = new int[26];
        char[] c = l.toCharArray();
        for(char cc:c)
        {
            int idx = cc - 'a';
            count[idx]++;
        }
        StringBuilder s = new StringBuilder();
        for(int i=0;i<26;i++)
        {
            s.append("+"+count[i]);
        }
        return s.toString();
    }
}
