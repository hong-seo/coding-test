import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for(char ch : myString.toCharArray()){
            if(ch == 'A'){
                sb.append("B");
            }
            else{
                sb.append("A");
            }
        }
        if(sb.toString().contains(pat)){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = br.readLine();
        String pat = br.readLine();
        System.out.println(solution(my, pat));
    }
}