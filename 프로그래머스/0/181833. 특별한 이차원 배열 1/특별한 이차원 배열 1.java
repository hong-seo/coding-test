import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[][] solution(int n) {
        int[][] arr = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(Arrays.deepToString(solution(n)));
    }
}