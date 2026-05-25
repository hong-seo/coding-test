import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static String solution(String my_string, int s, int e) {
        String front = my_string.substring(0, s);
        String middle = my_string.substring(s, e + 1);
        String back = my_string.substring(e + 1);
        StringBuilder sb = new StringBuilder(middle);
        String reversedMiddle = sb.reverse().toString();
        return front + reversedMiddle + back;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        my_string = my_string.replace("\"", "");
        int s = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        System.out.println(solution(my_string, s, e));
    }
}