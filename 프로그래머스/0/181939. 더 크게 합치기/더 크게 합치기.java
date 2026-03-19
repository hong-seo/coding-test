import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);
        return (ab >= ba) ? ab : ba;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println(solution(a,b));
    }
}