import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        int j=0;
        for(int i=start_num; i>=end_num;i--){
            answer[j]=i;
            j++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start=Integer.parseInt(br.readLine());
        int end=Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(start, end)));
    }
}