class Solution {
    public int solution(String[] babbling) {
        String[] arr ={"aya", "ye", "woo", "ma"};
		int answer =0;
		 for(int i = 0; i<babbling.length; i++) {
					 babbling[i]=babbling[i].replaceFirst(arr[0], "1");
					 babbling[i]=babbling[i].replaceFirst(arr[1], "1");
					 babbling[i]=babbling[i].replaceFirst(arr[2], "1");
					 babbling[i]=babbling[i].replaceFirst(arr[3], "1");
					 babbling[i]=babbling[i].replaceAll("1", "");
		 }
		 
		 for(int i=0; i<babbling.length; i++) {
			 if(babbling[i].length()==0){
				 answer+=1;
			 }
		 }
        
        return answer;
    }
}