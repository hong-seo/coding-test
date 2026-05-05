import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "abc\"");
        int count = st.countTokens();
        if(count == 0){
            return new String[] {"EMPTY"};
        }
        String[] answer = new String[count];
        
        for(int i = 0; i < count; i++){
            answer[i] = st.nextToken();
        }
        
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Arrays.toString(solution(str)));
    }
}