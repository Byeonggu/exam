import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] freqX = new int[10];
        int[] freqY = new int[10];

        for (char c : X.toCharArray()) {
            freqX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            freqY[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int commonFreq = Math.min(freqX[i], freqY[i]);
            for (int j = 0; j < commonFreq; j++) {
                sb.append(i);
            }
        }

        String answer = sb.toString();
        if (answer.isEmpty()) return "-1";
        if (answer.charAt(0) == '0') return "0";

        return answer;
    }
}
