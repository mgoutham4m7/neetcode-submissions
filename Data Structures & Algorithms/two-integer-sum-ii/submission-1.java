class Solution {
    public int[] twoSum(int[] numbers, int target) {
    //     Map<Integer, Integer> m = new HashMap<>();
    //     for(int i=1;i<=numbers.length;i++)
    //     {
    //         m.put(numbers[i-1],i);
    //     }
    //     for(int i=0;i<numbers.length;i++)
    //     {
    //         if(m.get(target-numbers[i])!=null)
    //         {
    //             return new int[]{i+1,m.get(target-numbers[i])};
    //         }
    //     }
    //     return new int[]{};

    // 2 pointers

    int i=0;
    int j=numbers.length-1;
    while(j>i)
    {
        if(numbers[i]+numbers[j]==target){return new int[]{i+1,j+1};}
        else if(numbers[i]+numbers[j]>target)
        {
            j-=1;
        }
        else{
            i+=1;
        }
    }
    return new int[]{};        
     }
}
