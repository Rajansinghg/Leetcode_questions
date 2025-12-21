class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int rValue = 0;
        int gCount =0;
      for(int num : nums){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }else{
            map.put(num,1);
        }
      }

    //   for (int i=0;i<map.size();i++){
    //     if(map.get(i)>gCount){
    //         rValue = map.get(i).getValue();
    //     }
    //   }

    for(Map.Entry<Integer,Integer> data : map.entrySet()){
        if(data.getValue()>gCount){
            rValue = data.getKey();
            gCount = data.getValue();
        }
    }
    return rValue;
    }
}