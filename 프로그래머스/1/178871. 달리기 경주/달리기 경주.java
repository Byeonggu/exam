import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }

        for (String calling : callings) {
            Integer index = playerIndexMap.get(calling);
            if (index != null && index > 0) {
                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;
                playerIndexMap.put(players[index], index);
                playerIndexMap.put(players[index - 1], index - 1);
            }
        }
        return players;
    }
}
