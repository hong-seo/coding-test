import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int temp;
        for(int i =0; i<queries.length; i++){
            temp = arr[queries[i][0]];
            arr[queries[i][0]]=arr[queries[i][1]];
            arr[queries[i][1]]=temp;            
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"[], ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(),"[], ");
        count = st.countTokens()/2;
        int[][] queries = new int[count][2];
        for(int i =0; i<count; i++){
            for(int j=0; j<2; j++){
                queries[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(Arrays.toString(solution(arr, queries)));

    }
}