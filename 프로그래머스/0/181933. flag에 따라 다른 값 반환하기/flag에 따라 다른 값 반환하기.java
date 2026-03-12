import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true){
            answer = a+b;   
        }
        else{
            answer=a-b;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        boolean flag = Boolean.parseBoolean(input[2]);

        Solution sol = new Solution();
        int result = sol.solution(a, b, flag);
        System.out.println(result);
    }
}