class Solution {
    // public int lengthOfLastWord(String s) {
    //     int count = 0;
    //     boolean countReset = false;
    //     for (int i=0;i<s.length();i++){
    //         if(s.charAt(i) != ' '){
    //             if(countReset){
    //                 count =0;
    //                 countReset =false;
    //             }
    //             count++;
    //         }else{
    //             countReset =true;
    //         }
    //     }
    //     return count;
    // }

    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean countReset = false;
        for (int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                count++;
            }
            else if(count>0 && s.charAt(i) == ' '){
                break;
            }
        }
        return count;
    }
}