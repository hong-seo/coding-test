import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                arr[j]+=1;
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine(),"[], ");
        //arr	queries
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        String str = br.readLine();
        str = str.substring(2, str.length()-2);
        String[] row = str.split("\\],\\[");
        int[][] queries = new int[row.length][];
        for(int i=0; i<row.length; i++){
            String[] col = row[i].split(",");
            queries[i] = new int[col.length];
            for(int j=0; j<col.length; j++){
                queries[i][j]=Integer.parseInt(col[j].trim());
            }
        }
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}