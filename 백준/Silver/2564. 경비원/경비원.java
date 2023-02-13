

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int T = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[T][2];

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		int startX = sc.nextInt();
		int startY = sc.nextInt();

		int sum = 0;
		for (int i = 0; i < T; i++) {
			// 시작 방향이 같은 사분면일 때

			if (arr[i][0] == startX) {

				sum += Math.abs(startY - arr[i][1]);

			} else if (startX == 1) {
				// 북
				if (arr[i][0] > 2) {
					// 목표 가게가 동쪽 서쪽
					if (arr[i][0] == 3) {
						// 서쪽
						sum += startY + arr[i][1];
					} else {
						// 동쪽
						sum += (Math.abs(X - startY)) + arr[i][1];
					}
				} else {
					// 목표가게가 남쪽
					int temp = Y + startY + arr[i][1];
					temp = Math.min(temp, Y + Math.abs(X - startY) + Math.abs(X - arr[i][1]));
					sum += temp;
				}
			} else if (startX == 2) {
				// 남쪽
				if (arr[i][0] > 2) {
					// 목표 가게가 동쪽 서쪽
					if (arr[i][0] == 3) {
						// 서쪽
						sum += startY + Math.abs(Y - arr[i][1]);
					} else {
						// 동쪽
						sum += Math.abs(X - startY) + Math.abs(Y - arr[i][1]);
					}
				} else {
					// 목표가게가 북쪽
					int temp = Y + startY + arr[i][1];
					temp = Math.min(temp, Y + Math.abs(X - startY) + Math.abs(X - arr[i][1]));
					sum += temp;
				}
			} else if (startX == 3) {
				// 시작점 서쪽
				if (arr[i][0] <= 2) {
					// 목표 가게가 북쪽 남쪽
					if (arr[i][0] == 1) {
						// 북쪽
						sum += arr[i][1] + startY;
					} else {
						// 남쪽
						sum += Math.abs(Y - startY) + (arr[i][1]);
					}
				} else {
					// 목표가게가 동쪽
					int temp = X + startY + arr[i][1];
					temp = Math.min(temp, X + Math.abs(Y - startY) + Math.abs(Y - arr[i][1]));
					sum += temp;
				}

			} else if (startX == 4) {
				// 시작점 동쪽

				if (arr[i][0] <= 2) {
					// 목표 가게가 북쪽 남쪽
					if (arr[i][0] == 1) {
						// 북쪽
						sum += Math.abs(X - arr[i][1]) + startY;
					} else {
						// 남쪽
						sum += Math.abs(Y - startY) + Math.abs(X - arr[i][1]);
					}
				} else {
					// 목표가게가 서쪽
					int temp = X + startY + arr[i][1];
					temp = Math.min(temp, X + Math.abs(Y - startY) + Math.abs(Y - arr[i][1]));
					sum += temp;
				}

			}
		}

		System.out.println(sum);
	}
}