import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[][] arr) {
        int count = arr[0].length;
        for(int i=0; i<count; i++){
            for(int j=0; j<count; j++){
                if(arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().replaceAll("[\\[\\]]", "");
        StringTokenizer st = new StringTokenizer(input, ", ");
        int count = (int)Math.sqrt(st.countTokens());
        int[][] arr = new int[count][count];
        for(int i=0; i<count; i++){
            for(int j=0; j<count; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(arr));
    }
}