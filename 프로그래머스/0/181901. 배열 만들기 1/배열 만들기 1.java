import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i=0; i<n/k; i++){
            answer[i]= k*(i+1);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int k= Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(n, k)));
    }
}