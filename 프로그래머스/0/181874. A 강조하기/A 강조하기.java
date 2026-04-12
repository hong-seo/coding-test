import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String myString) {
        myString = myString.toLowerCase();
        return myString.replace('a','A');
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = new String(br.readLine());
        System.out.println(solution(my));
    }
}