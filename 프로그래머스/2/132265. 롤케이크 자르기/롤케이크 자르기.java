import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        // 각 토핑의 개수를 카운트하는 맵
        Map<Integer, Integer> rightCount = new HashMap<>();
        Set<Integer> leftToppings = new HashSet<>();
        
        
        // 오른쪽 조각에 들어갈 토핑
        for (int top : topping) {
            rightCount.put(top, rightCount.getOrDefault(top, 0) + 1);
        }
        
          for (int i = 0; i < topping.length; i++) {
            int currentTopping = topping[i];
            
            // 왼쪽 조각에 현재 토핑을 추가
            leftToppings.add(currentTopping);
            
            // 오른쪽 조각에서 현재 토핑 개수를 줄임
            rightCount.put(currentTopping, rightCount.get(currentTopping) - 1);
            
            // 만약 오른쪽에 더 이상 이 토핑이 없다면 삭제
            if (rightCount.get(currentTopping) == 0) {
                rightCount.remove(currentTopping);
            }
            
            // 왼쪽과 오른쪽의 토핑 종류 수가 같으면 공평하게 나눌 수 있음
            if (leftToppings.size() == rightCount.size()) {
                answer++;
            }
        }
        
        
        return answer;
    }
}