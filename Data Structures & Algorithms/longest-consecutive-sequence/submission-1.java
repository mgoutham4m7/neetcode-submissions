class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
        {
            return 0;
        }
        List<Integer> r = new ArrayList<>();
        Arrays.sort(nums);
        int l=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1] != nums[i])
            {

            if(nums[i+1] == nums[i]+1)
            {
                l++;
                System.out.println(nums[i+1]+" "+nums[i]);
            }
            else
            {
                System.out.println("adding");
                r.add(l+1);
                l=0;
            }
            }
        }
        r.add(l+1);
        System.out.println(r);
        return Collections.max(r);
    }
}
