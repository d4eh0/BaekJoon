import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n % 10 != 0 || n > 0) {
            answer += n % 10;
            System.out.println(n % 10);
            n /= 10;
        }
        return answer;
    }
}