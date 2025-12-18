class Solution {
    // public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length()){
    //         return false;
    //     }

    //     for(int i = 0; i < s.length(); i++){
    //         if(t.indexOf(s.charAt(i))!= -1){
    //             t = t.substring(0,t.indexOf(s.charAt(i))) + t.substring(t.indexOf(s.charAt(i))+1);
    //         }else{
    //             return false;
    //         }
    //     }
    //     return true;
    // }

     public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length()){return false;}

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray,tArray);
     }
}