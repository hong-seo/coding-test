import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Solution {
    public static String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        for(char ch : rny_string.toCharArray()){
            if(ch == 'm'){
                sb.append("rn");
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        System.out.println(solution(st));
    }
}