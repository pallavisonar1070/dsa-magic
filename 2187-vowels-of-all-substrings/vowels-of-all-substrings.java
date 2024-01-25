class Solution {
    public long countVowels(String word) {
        int n = word.length();
        long total = 0;
        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);
            int iChar = 0;
            int s = i + 1;
            int e = n - i;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                iChar++;
            }
            long freq = (long) s * e;
            total += freq * iChar;
        }
        return total;
    }
}