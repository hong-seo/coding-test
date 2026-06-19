import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[][] solution(int[][] arr) {
        int col = arr[0].length;
        int row = arr.length;
        int max = Math.max(col, row);
        int[][] answer = new int[max][max];
       for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        first= first.substring(2, first.length()-2);
        String[] str = first.split("\\], \\[");
        int[][] arr = new int[str.length][];
        for(int i=0; i<str.length; i++){
            StringTokenizer st = new StringTokenizer(str[i],", ");
            int count = st.countTokens();
            arr[i] = new int[count];
            for(int j=0; j<count; j++ ){
                arr[i][j] =Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(Arrays.deepToString(solution(arr)));
    }
}