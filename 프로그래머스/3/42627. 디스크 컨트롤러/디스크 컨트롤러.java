import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int totalTime=0;
        int jobCnt = 0;
        int end =0;
        int cnt =0;
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        while (cnt < jobs.length) {
			while (jobCnt < jobs.length && jobs[jobCnt][0] <= end) {
				pq.add(jobs[jobCnt++]);
			}
			if (pq.isEmpty()) {
				end = jobs[jobCnt][0];
			} else {
				int[] tmp = pq.poll();
				answer += tmp[1] + end - tmp[0];
				end += tmp[1];
				cnt++;
			}
		}
        
        int result = (int) Math.floor(answer/jobs.length);
        return result;
    }
}