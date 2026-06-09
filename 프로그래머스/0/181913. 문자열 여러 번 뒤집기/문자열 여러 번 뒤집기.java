import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, int[][] queries) {
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            sb =new StringBuilder();
            String first = my_string.substring(0,s);
            String second =my_string.substring(s, e+1);
            second = sb.append(second).reverse().toString();
            String third = my_string.substring(e+1);
            my_string = first+second+third;
        }
        return my_string;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = br.readLine();
        my = my.substring(1,my.length()-1);
        String arr = br.readLine();
        arr = arr.substring(2, arr.length()-2);
        String[] query = arr.split("\\], \\[");
        int[][] queries=new int[query.length][2];
        for(int i=0; i<query.length; i++){
            StringTokenizer st = new StringTokenizer(query[i],", ");
            int count = st.countTokens();
            for(int j=0; j<count; j++){
                queries[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(my, queries));
    }
}