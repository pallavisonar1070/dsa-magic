class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            int y = target - nums[i];
            if(hm.containsKey(y)){
                int index = hm.get(y);
                ans[0] = index;
                ans[1] = i;
                break;
            }
            hm.put(nums[i], i);          
        }
        return ans;
    }
}