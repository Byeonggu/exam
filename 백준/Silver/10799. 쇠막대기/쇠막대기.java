import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);

		Stack<String> stack;

		stack = new Stack<>();
		String[] arr = sc.nextLine().split("");
		boolean flag = true;
		int cnt = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("(")) {
				cnt++;
				stack.add(arr[i]);
				flag = true;
			} else {
				if (flag) {
					stack.pop();
					cnt--;
					sum += cnt + stack.size();
					cnt = 0;
				} else {
					stack.pop();
				}
				flag = false;
			}

		}

		System.out.println(sum);

	}

}