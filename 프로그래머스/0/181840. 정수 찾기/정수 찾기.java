import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] num_list, int n) {
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]==n){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");
        int n = Integer.parseInt(br.readLine());
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr, n));
    }
}