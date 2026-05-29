import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String myString, String pat) {
        int num = myString.lastIndexOf(pat);
        String answer = myString.substring(0,num+pat.length());
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myString = br.readLine().replace("\"","");
        String pat = br.readLine().replace("\"","");
        System.out.println(solution(myString, pat));
    }
}