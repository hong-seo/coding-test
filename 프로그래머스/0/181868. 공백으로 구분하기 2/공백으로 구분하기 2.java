import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int count = st.countTokens();
        String[] my = new String[count];
        for(int i = 0; i<count; i++){
            my[i] = st.nextToken();
        }
        return my;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        System.out.println(Arrays.toString(solution(st)));
    }
}