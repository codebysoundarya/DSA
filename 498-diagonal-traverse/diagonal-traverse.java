class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
          int m=mat.length;
          int n=mat[0].length;

          int row=0;  int col=0;

          int [] ans = new int[n*m];
   
          boolean up=true;
          int idx=0;

          while(row<m && col<n)
          {
            if(up==true)
            {
                while(row>0 && col<n-1)
                {
                    ans[idx++]=mat[row][col];
                    row--;
                    col++;
                }
                ans[idx++]=mat[row][col];
                if(col==n-1)
                {
                    row++;
                }
                else
                {
                    col++;
                }



            }
            else
            {
                while(col>0 && row<m-1)
                {
                    ans[idx++]=mat[row][col];
                    row++;
                    col--;
                }
                ans[idx++] = mat[row][col];
                if(row==m-1)
                {
                    col++;
                }
                else
                {
                    row++;
                }

            }

            up = !up;
          }

          return ans;
          
        
    }
}