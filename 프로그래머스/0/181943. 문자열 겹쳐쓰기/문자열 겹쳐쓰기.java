import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb =new StringBuilder();
        sb.append(my_string.substring(0,s));
        sb.append(overwrite_string);
        sb.append(my_string.substring(s+overwrite_string.length()));
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = br.readLine().replace("\"", "");
        String over = br.readLine().replace("\"", "");
        int s = Integer.parseInt(br.readLine());
        System.out.println(solution(my, over, s));
    }
}