import java.util.*;
import java.util.stream.Collectors;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generateds method stub
		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.nextLine().toUpperCase();
		
		String[] arr = str.split("");
		
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
		String[] resultArr = hashSet.toArray(new String[0]);
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int j=0; j<resultArr.length; j++) {
			map.put(resultArr[j], 0);
		}
		
		for(int i = 0; i< arr.length; i++) {
			for(int j=0; j<resultArr.length; j++) {
				if(arr[i].equals(resultArr[j]) ) {
					
					
					int addnum = map.get(resultArr[j])+1;
					map.put(resultArr[j], addnum);
				}
			}
		}
		
		int maxValue = Collections.max(map.values());
		
        List<String> maxValueKeys = map.entrySet().stream()
                .filter(entry -> entry.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
 
        if(maxValueKeys.size()==1) {
        	System.out.println(maxValueKeys.get(0));
        }else {
        	System.out.println("?");
        }
        
	}

}