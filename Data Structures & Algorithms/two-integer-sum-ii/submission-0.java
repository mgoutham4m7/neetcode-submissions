class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=1;i<=numbers.length;i++)
        {
            m.put(numbers[i-1],i);
        }
        for(int i=0;i<numbers.length;i++)
        {
            if(m.get(target-numbers[i])!=null)
            {
                return new int[]{i+1,m.get(target-numbers[i])};
            }
        }
        return new int[]{};

        
    }
}
