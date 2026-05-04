import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<my_strings.length; i++){
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"[]\", ");
        int count = st.countTokens();
        String[] str = new String[count];
        for(int i=0; i<count; i++){
            str[i]=st.nextToken();
        }
        st = new StringTokenizer(br.readLine(),"[], ");
        int[][] arr =new int[count][2];
        for(int i=0; i<count; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(str, arr));
    }
}