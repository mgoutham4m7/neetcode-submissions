class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map < Integer, Integer > m = new HashMap < > ();
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.get(nums[i]) != null) {
                int currentCount = m.get(nums[i]);
                m.put(nums[i], currentCount + 1);

            } else {
                m.put(nums[i], 1);
            }
            bucket.add(new ArrayList<>());
            System.out.println("ll " + bucket);
        }
        bucket.add(new ArrayList<>());
        for (Map.Entry < Integer, Integer > entry: m.entrySet()) {
            System.out.println("entered");
            Integer key = entry.getKey();
            Integer v = entry.getValue();
            bucket.get(v).add(key);
            }
            System.out.println("ll " + bucket);

        // top k elements
        int[] r = new int[k];
        int j=0;

        for(int i=nums.length;i>=0;i--)
        {
            if(k!=0){

            List<Integer> p = bucket.get(i);
            for (int t = 0; t < p.size(); t++) {
                r[j]=p.get(t);
                System.out.println(r[t]);
                k--;
                j++;
               
            }
            }
                
            
        }    
            return r;
        }

        
    }