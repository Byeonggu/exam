import java.util.*;

class Solution {
    public int[] solution(String msg) {
        char[] arr = msg.toCharArray();
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int idx = 27;

        // 사전 초기화 (A-Z를 1~26으로 매핑)
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        for (int i = 0; i < arr.length; ) {
            StringBuilder wcWord = new StringBuilder();  // 한 글자씩 축적하기 위한 StringBuilder
            wcWord.append(arr[i]);

            int j = i + 1;
            while (j < arr.length && map.containsKey(wcWord.toString() + arr[j])) {
                wcWord.append(arr[j]);
                j++;
            }

            // 사전에서 가장 긴 단어의 인덱스를 저장
            answer.add(map.get(wcWord.toString()));

            // 다음 단어를 사전에 추가
            if (j < arr.length) {
                map.put(wcWord.toString() + arr[j], idx++);
            }

            // 인덱스를 건너뛰어 그 다음 단어로 이동
            i += wcWord.length();
        }

        // ArrayList<Integer>를 int[]로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
