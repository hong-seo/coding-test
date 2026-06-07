import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min=-1;
            for(int j=s; j<=e; j++){
                if(arr[j]>k){
                    if(min==-1){
                        min =arr[j];
                    }
                    if(min>arr[j]){
                        min = arr[j];
                    }
                }
            }
            answer[i]=min;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ar = br.readLine();
        ar = ar.substring(1, ar.length()-1);
        StringTokenizer st = new StringTokenizer(ar,", ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String que = br.readLine();
        que = que.substring(2, que.length()-2);
        String[] query = que.split("\\],\\[");
        int[][] queries=new int[query.length][];
        for(int i=0; i<query.length; i++){
            st = new StringTokenizer(query[i],", ");
            count = st.countTokens();
            queries[i] = new int[count];
            for(int j=0; j<count; j++){
                queries[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}