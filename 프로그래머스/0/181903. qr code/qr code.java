import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for(int i=r; i<code.length(); i+=q){
            sb.append(code.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        String code = br.readLine();
        code = code.replace("\"","");
        System.out.println(solution(q, r, code));
    }
}