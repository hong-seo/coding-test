import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int right=n-1, left=0, up=0, down =n-1;
        int i=1;
        while (i <= n * n) {
            for (int j = left; j <= right; j++) {
                arr[up][j] = i++;
            }
            up++;
            if (i > n * n) break;
            for (int j = up; j <= down; j++) {
                arr[j][right] = i++;
            }
            right--;
            if (i > n * n) break;
            for (int j = right; j >= left; j--) {
                arr[down][j] = i++;
            }
            down--;
            if (i > n * n) break;
            for (int j = down; j >= up; j--) {
                arr[j][left] = i++;
            }
            left++;
            if (i > n * n) break;
        }   
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(Arrays.deepToString(solution(n)));
    }
}