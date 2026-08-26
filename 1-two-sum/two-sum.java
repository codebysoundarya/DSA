class Solution {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0 ; i<nums.length ; i++)
        {
            int sol = target - nums[i];

                if(mpp.containsKey(sol))
                {
                    return new int[]  {i,mpp.get(sol)};
                }

                mpp.put(nums[i],i);


        }
       
       return new int[] {-1,-1};




        
    }
}