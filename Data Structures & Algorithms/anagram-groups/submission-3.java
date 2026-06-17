class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> l = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        for (int i=0;i<strs.length;i++)
        {
            l1.add(so(strs[i]));
        }
        for (int i=0;i<strs.length;i++)
        {
            List<String> ll = new ArrayList<>();
            if(l1.get(i) == "0")
            {
                continue;
            }
            ll.add(strs[i]);
            for (int j=i+1;j<strs.length;j++)
            {
                if(!l1.get(j).equals("0") && l1.get(i).equals(l1.get(j)))
                {   
                    ll.add(strs[j]);
                    l1.set(j,"0");
                }
            }

            l.add(ll);
        }
        return l;



    }
    public String so(String i)
    {
        char[] c = i.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
