import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for(int i=(my_string.length()-n); i<my_string.length(); i++){
            char c=my_string.charAt(i);
            answer.append(c);
        }
        return answer.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(br.readLine());
        System.out.println(solution(str, num));
    }
}