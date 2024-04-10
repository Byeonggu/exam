class Solution {
    int lastnum;
    int answer;
    int targetNum;
    public int solution(int[] numbers, int target) {
        answer = 0;
        lastnum = numbers.length;
        targetNum = target;
        dfs(numbers, 0, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int idx, int num, int depth){
        if(depth==lastnum){
            if(num == targetNum)answer++;
            return;
        }
        
        dfs(numbers, idx+1, num+numbers[idx], depth+1);
        dfs(numbers, idx+1, num-numbers[idx], depth+1);
        
    }
}