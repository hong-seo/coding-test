import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Solution {
    public static String solution(String my_string, int k) {
        String answer ="";
        for(int i=0; i<k; i++){
            answer+=my_string;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k=Integer.parseInt(br.readLine());
        String answer = solution(str, k); 
        System.out.println(answer);
    }
}