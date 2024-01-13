class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxA = -1;
        for(int i = n-1; i >= 0; i--){
            if(arr[i] > maxA){
                int org = arr[i];
                arr[i] = maxA;
                maxA = org;
            }else{
                 arr[i] = maxA;
            }
        }
        return arr;
    }
}