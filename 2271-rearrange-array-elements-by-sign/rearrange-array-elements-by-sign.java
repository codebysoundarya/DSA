class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length/2;
         int [] pos = new int[n];
         int [] neg = new int[n];

        
        int posIndex=0;
        int negIndex=0;

        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] > 0)
            {
                pos[posIndex]=nums[i];
                posIndex++;

            }
            else
            {
                neg[negIndex]=nums[i];
                negIndex++;
            }
        }

        for( int i=0 ; i<nums.length/2 ; i++)
        {
           nums[i*2] = pos[i];
           nums[(i*2)+1] = neg[i]; 

        }
        return nums;
        
    }
}