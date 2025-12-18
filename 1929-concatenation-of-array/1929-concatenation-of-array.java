class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] numArr = new int[(nums.length*2)];
        int j=0;
        for(int i=0;i<numArr.length;i++){
            numArr[i] = nums[j];
            j++;
            if(j==nums.length){j=0;}
        }
        return numArr;
    }
}