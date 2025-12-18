class Solution {
    public int scoreOfString(String s) {
        char[] stringArray = s.toCharArray();
        int count =0;
        int difference = 0;
        for(int i=1;i<stringArray.length;i++){
            if((int)stringArray[count] >= (int)stringArray[i] ){
            difference +=  (int)stringArray[count]-(int)stringArray[i];
            }else{
            difference +=  (int)stringArray[i] - (int)stringArray[count];
            }
            count++;
        }
        return difference;
    }
}