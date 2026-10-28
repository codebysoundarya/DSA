class Solution {

    void reverse(int[] row)
    {
        int start = 0;
        int end = row.length-1;

        while(start <= end)
        {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0 ; i<row-1 ; i++)
        {
            for(int j=i+1 ; j<col ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
       for(int i=0 ; i<row ; i++)
       {
          reverse(matrix[i]);
       }
        
    }
}