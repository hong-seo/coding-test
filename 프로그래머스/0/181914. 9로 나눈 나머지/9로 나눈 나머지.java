import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String number) {
        int sum = 0;
        for(int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }
        return sum % 9;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        System.out.println(solution(num));
    }
}