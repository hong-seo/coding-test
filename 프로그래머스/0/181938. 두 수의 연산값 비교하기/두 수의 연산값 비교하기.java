import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(int a, int b) {
        int num = Integer.parseInt(""+a+b);
        return 2*a*b > num ? 2*a*b : num;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(br.readLine());
        int b =Integer.parseInt(br.readLine());
        System.out.println(solution(a, b));
    }
}