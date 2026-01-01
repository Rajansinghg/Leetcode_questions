class Solution {
    public void sortColors(int[] nums) {
        sort(nums,0,nums.length-1);
    }
    public static int[] sort(int[] nums ,int low,int high){
        if(low < high){
            int devide = quickSort(nums, low , high);
            sort(nums, low , devide-1);
            sort(nums, devide+1 , high);
        }
        return nums;
    }
    public static int quickSort(int[] arr ,int low,int high){
        int puvoit = arr[high];
        int i = low-1;
        for (int j=low;j<high;j++){
            if(arr[j]<puvoit){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}