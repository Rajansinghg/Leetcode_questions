class Solution {
    public int[] replaceElements(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            int gratest = -1;
            for (int j=i+1; j < arr.length; j++){ 
                // if(i+1 == arr.length){
                //     gratest=-1;
                // }
               if(arr[j] > gratest){
                    gratest = arr[j];
                }
            }

            newArr[i] = gratest;
        }
        return newArr;
    }
}