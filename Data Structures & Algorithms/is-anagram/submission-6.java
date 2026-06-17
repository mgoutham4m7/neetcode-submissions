class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length())
        {
            return false;
        }
        else
        {
            char[] sl = s.toCharArray();
            char[] tl = t.toCharArray();
            Arrays.sort(sl);
            Arrays.sort(tl);
            for(int i=0;i<t.length();i++)
            {
                if((sl[i] != tl[i]))
                {
                    return false;
                }
            }
        }
        return true;

    }
}
