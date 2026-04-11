import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static String[] solution(String my_string) {
        String[] arr =my_string.split(" ",0);
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        System.out.println(Arrays.toString(solution(st)));
    }
}