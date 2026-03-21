import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            answer[i]=num_list[i];
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count =st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int n=Integer.parseInt(br.readLine());
        int[] result = solution(arr, n);
        System.out.println(Arrays.toString(result));
    }
}
