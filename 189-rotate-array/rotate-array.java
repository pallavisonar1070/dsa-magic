class Solution {
    public static int[] reverseArray(int[] A, int s, int e){
        while(s < e){
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }
    public static void printArray(int[] A, int n){
        for(int i = 0; i< n; i++){
            System.out.print(A[i] + " ");
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // To avoid repeatative rotation
        k = k % n;
        if(k < 0){ 
            k = k + n;
        }
        reverseArray(nums, 0, n-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);
    }
}