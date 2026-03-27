import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[] solution(int start_num, int end_num) {
        int[] arr = new int[end_num-start_num+1];
        int count = end_num-start_num;
        for(int i=0; i<=count; i++){
            arr[i]=start_num;
            start_num++;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s_num = Integer.parseInt(br.readLine());
        int e_num = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(s_num, e_num)));
    }
}