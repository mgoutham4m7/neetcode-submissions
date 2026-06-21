class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> s1 = new HashSet<>();
        for (int i=0;i<nums.length;i++)
        {
        Set<Integer> s = new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int k = -(nums[i]+nums[j]);
                if (s.contains(k))
                {
                    List<Integer> t = new ArrayList<>(List.of(nums[i], nums[j], k));
                    Collections.sort(t);
                    s1.add(t);
                }
                s.add(nums[j]);
            }
            
        }
        List<List<Integer>> l = new ArrayList<>();
        for(List<Integer> p:s1)
        {
            l.add(p);
        }
        return l;
        
        
    }
}
