public class Main {
	public static void main(String[] args) {
		boolean[] arr= new boolean[10001];
		for(int i=0; i<10000; i++) {
			int t = fnc(i);
			if(t<=10000)
			arr[t]= true;
		}
		
		for(int i=0; i<=10000; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	
	}
	public static int fnc(int a) {
		int sum = a;
		String[] str= Integer.toString(a).split("");
		for(String s: str) { 
			sum+= Integer.parseInt(s);
		}
		return sum;
	}
}