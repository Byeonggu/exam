class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i: array){
            int num = i+n;
            if(num>90&&i<=90||num>122&&i>=97){
                num=num-26;
            }else if(i==32){
                num=32;
            }
            char tmp =(char)num;
            sb.append(tmp);    
        }
        answer = sb.toString();
        return answer;
    }
}