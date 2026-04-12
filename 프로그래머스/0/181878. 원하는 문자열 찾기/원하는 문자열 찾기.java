import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if(myString.contains(pat)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = new String(br.readLine());
        String pat = new String(br.readLine());
        System.out.println(solution(my, pat));
    }
}