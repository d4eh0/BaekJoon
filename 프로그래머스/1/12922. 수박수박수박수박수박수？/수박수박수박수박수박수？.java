class Solution {
    public String solution(int n) {
        String answer = "수";
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) answer += "박";
            else answer += "수";
        }
        return answer;
    }
}