class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        for (String word : goal) {
            if (idx1 < cards1.length) {
                if (word.equals(cards1[idx1])) {
                    idx1++;
                    continue;
                }
            }
            if (idx2 < cards2.length) {
                if (word.equals(cards2[idx2])){
                    idx2++;
                    continue;
                }
            }
            return "No";
        }
        return "Yes";
    }
}