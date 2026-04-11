import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, String alp) {
        if (my_string.contains(alp)) {
            my_string= my_string.replace(alp, alp.toUpperCase());
        }
        return my_string;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = new String(br.readLine());
        String alp = new String(br.readLine());
        System.out.println(solution(my, alp));
    }
}