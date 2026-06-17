class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int k=0;
        for(int i=0;i<matrix.length;i++)
        {
            int rtt = matrix[i][matrix[i].length-1];
            if(rtt>=target)
            {k = i;break;}
        }
        int i=0;
        System.out.println(k);
        int j=matrix[k].length-1;
        while(j>=i)
        {
            int m = (i+j)/2;
            if(matrix[k][m] == target)
            return true;
            else if(matrix[k][m] > target)
            j--;
            else
            i++;

        }
        return false;
        
    }
}
