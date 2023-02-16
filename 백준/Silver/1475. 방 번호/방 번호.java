import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		String[] str = sc.nextLine().split("");
		for(int i=0; i<str.length; i++) {
			arr[Integer.parseInt(str[i])]++;
		}
		
		int k = (arr[6] + arr[9]);
		
		if (k % 2 == 0) {
            arr[6] = k / 2;
            arr[9] = k / 2;
        }
        else {
            arr[6] = k / 2 + 1;
            arr[9] = k / 2 + 1;
        }
		
		int max = 0;

		//System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	
	}


}