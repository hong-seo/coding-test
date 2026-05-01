import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for(int i=c-1; i<my_string.length(); i+=m){
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = br.readLine().replace("\"", "");
        int m = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        System.out.println(solution(my, m, c));
    }
}