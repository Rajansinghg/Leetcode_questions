class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp; // value -> index

        for(int i = 0; i < nums.size(); i++) {
            int diff = target - nums[i];

            // If the complement exists, return its index and current index
            if(mp.find(diff) != mp.end()) {
                return { mp[diff], i };
            }

            // Store the number with its index
            mp[nums[i]] = i;
        }

        return {}; // not really needed since one solution always exists
    }
};
