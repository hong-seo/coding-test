import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            answer[i]=my_string.substring(i, my_string.length());
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = br.readLine();
        System.out.println(Arrays.toString(solution(my)));
    }
}