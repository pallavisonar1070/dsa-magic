class Solution {
    public static int[] psum(int[] A){
        int n = A.length;
        int[] psum = new int[n];
        psum[0] = A[0];
        for(int i = 1; i < n; i++){
            psum[i] = psum[i-1] + A[i];
        }
        return psum;
    }
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int[] ps = psum(nums);
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                int sum = 0;
                if(s == 0)
                  sum += ps[e];
                else 
                    sum += ps[e] - ps[s-1];
                if(sum == k)
                    count++;
            }
        }
        return count;
    }
}