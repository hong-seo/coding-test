import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int n=Integer.parseInt(br.readLine());
        System.out.println(solution(st, n));
    }
}