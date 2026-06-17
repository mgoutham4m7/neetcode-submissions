class Solution {
    public boolean isPalindrome(String s) 
    {
        String i = s.replaceAll(" ","");
        String f = i.replaceAll("[^A-Za-z0-9]","");

        StringBuilder fin = new StringBuilder(f);
        String p = fin.toString();
        String rev = fin.reverse().toString();
        p = p.toLowerCase();
        rev= rev.toLowerCase();
        return p.equals(rev);
        
    }
}
