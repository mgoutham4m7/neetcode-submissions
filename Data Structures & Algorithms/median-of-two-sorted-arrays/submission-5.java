class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length ==0)
        {
            return -0.5;
        }
        
        else if(nums1.length == 0 || nums2.length ==0)
        {
            if(nums1.length == 0)
            {
                int ln = nums2.length;
                System.out.println(nums2[(((ln-1)/2)+1)/2]);
                if(ln%2==0)
                {
                    return (double)(nums2[(ln-1)/2]+nums2[((ln-1)/2)+1])/2;
                }
                else
                {
                    return nums2[ln/2];  
                }
                
            }
            else
            {
                int ln = nums1.length;
                
                if(ln%2==0)
                {
                    System.out.println(nums1[(ln-1)/2]);
                    return (double)(nums1[(ln-1)/2]+nums1[((ln-1)/2)+1])/2;
                }
                else
                {
                    return nums1[ln/2];  
                }

            }
        }
        
        List<Integer> l = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j])
            {
                l.add(nums2[j]);
                j++;
            }
            else
            {
                l.add(nums1[i]);
                i++;
            }
            
        }
        System.out.println(l);
        if(i!=nums1.length)
        {
            for(int k=i;k<nums1.length;k++)
            {
                l.add(nums1[k]);
            }
        }
        if(j!=nums2.length)
        {
            for(int k=j;k<nums2.length;k++)
            {
                l.add(nums2[k]);
            }
        }
        System.out.println(l);
        int ln = l.size();
        if(ln%2==0)
        {
            return (double)(l.get((ln-1)/2)+l.get(((ln-1)/2)+1))/2;
        }
        return l.get(ln/2);

        
    }
}
