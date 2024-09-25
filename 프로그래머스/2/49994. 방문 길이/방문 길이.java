import java.util.*;

class Solution {
    public int solution(String dirs) {
        int x = 0, y = 0;
        Set<String> visitedPaths = new HashSet<>(); // 지나간 경로를 기록할 Set
        
      
        int[] dx = {0, 0, 1, -1}; 
        int[] dy = {1, -1, 0, 0}; 
        String directions = "RLUD"; 
        
        for (char dir : dirs.toCharArray()) {
            int idx = directions.indexOf(dir); 
            int nx = x + dx[idx];
            int ny = y + dy[idx];
            
          
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }
            
            // 이전 위치에서 새로운 위치로 가는 경로와 그 반대 경로를 기록
            String path1 = x + "," + y + "->" + nx + "," + ny;
            String path2 = nx + "," + ny + "->" + x + "," + y;
            
            // 처음 지나간 길이면 기록
            if (!visitedPaths.contains(path1)) {
                visitedPaths.add(path1);
                visitedPaths.add(path2); 
            }
            
            // 좌표 갱신
            x = nx;
            y = ny;
        }
        
        // Set에 저장된 경로의 절반이 처음 지나간 길의 개수 (양방향 저장했으므로 2배가 됨)
        return visitedPaths.size() / 2;
    }
}
