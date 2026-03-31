import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String my_string, String is_suffix) {
        if(my_string.endsWith(is_suffix)){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = br.readLine();
        String suffix = br.readLine();
        System.out.println(solution(my,suffix));
    }
}