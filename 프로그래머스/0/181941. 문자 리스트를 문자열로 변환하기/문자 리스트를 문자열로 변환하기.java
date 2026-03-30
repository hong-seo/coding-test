import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String solution(String[] arr) {
        return String.join("",arr);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().replace("\"",""),", ");
        int count=st.countTokens();
        String[] arr = new String[count];
        for(int i=0; i<count; i++){
            arr[i]=st.nextToken();
        }
        System.out.println(solution(arr));
    }
}