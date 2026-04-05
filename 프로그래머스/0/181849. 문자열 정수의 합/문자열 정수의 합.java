import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String num_str) {
        char[] ch = num_str.toCharArray();
        int answer=0;
        for(char c : ch){
            answer+=c-'0';
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        System.out.println(solution(st));
    }
}