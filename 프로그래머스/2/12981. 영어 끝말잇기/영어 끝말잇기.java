import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        Set<String> set = new HashSet<>(); 

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char lastChar = (i == 0) ? word.charAt(0) : words[i - 1].charAt(words[i - 1].length() - 1);

            if (set.contains(word) || word.charAt(0) != lastChar) { 
                answer[0] = (i % n) + 1; 
                answer[1] = (i / n) + 1; 
                break;
            }

            set.add(word); 
        }

        return answer;
    }
}