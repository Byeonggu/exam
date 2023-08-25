import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);


        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));
    }

    static int factorial(int N) {
        if(N == 0) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}
