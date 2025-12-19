class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] charArr = s.toCharArray();
        int lastIndex = 0;
        for (char letter : charArr){
            if(t.indexOf(letter) == -1){
                return false;
            }else{
                t = t.substring(t.indexOf(letter)+1);
            }
        }
        return true;
    }
}