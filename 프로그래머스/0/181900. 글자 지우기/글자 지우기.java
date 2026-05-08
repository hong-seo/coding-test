import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, int[] indices) {
        StringBuilder sb =new StringBuilder(my_string);
        Arrays.sort(indices);
        for(int i=0; i<indices.length; i++){
            sb.deleteCharAt(indices[i]-i);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().replace("\"","");
        StringTokenizer st = new StringTokenizer(br.readLine(),",[] ");
        int count = st.countTokens();
        int[] arr =new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(str, arr));
    }
}