import java.util.*;

class Solution {
    static int[] arr;
    static int answer = 0;

    public int solution(int[] number) {
        arr = number;
        dfs(0, 0, 0);
        return answer;
    }

    void dfs(int start, int sum, int depth) {
        // 종료 조건: 3명을 선택한 경우
        if (depth == 3) {
            if (sum == 0) {
                answer++;
            }
            return;
        }

        // 현재 학생 이후의 학생들만 선택
        for (int i = start; i < arr.length; i++) {
            dfs(i + 1, sum + arr[i], depth + 1);
        }
    }
}