class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer ,Integer> map = new HashMap<>();
        int[] returnArr = new int[k];

        for (int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

       List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());


        for (int i = 0; i < k; i++) {
            returnArr[i] = list.get(i).getKey();
        }

        return returnArr;
    }
}