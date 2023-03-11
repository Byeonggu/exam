import java.util.*;

public class Main {
    public static long fnc(long a, long b){
        while(b!=0){
            long r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(a * b / fnc(a, b));
    }
}