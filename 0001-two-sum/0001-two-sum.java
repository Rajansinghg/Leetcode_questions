class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int index0 = 0, index1 = 0;
        int[] retArr = new int[2] ;
        for (int i=0; i < nums.length; i++){
            // if(nums[i]>target){continue;}
            for (int j=i+1;j<nums.length;j++){
                // if(nums[j]>target){continue;}
                if(nums[i]+nums[j] == target){
                    retArr[0] = i;
                    retArr[1] = j;
                }
            }
        }
        return retArr;
    }
}