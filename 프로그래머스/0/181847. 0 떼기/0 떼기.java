import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String n_str) {
        for(int i=0; i<n_str.length(); i++){
            if(n_str.charAt(i)!='0'){
                return n_str.substring(i);
            }
        }
        return n_str;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        System.out.println(solution(st));

    }
}