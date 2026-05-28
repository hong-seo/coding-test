import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1||x2)&&(x3||x4);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean x1 = Boolean.parseBoolean(br.readLine());
        boolean x2 = Boolean.parseBoolean(br.readLine());
        boolean x3 = Boolean.parseBoolean(br.readLine());
        boolean x4 = Boolean.parseBoolean(br.readLine());
        System.out.println(solution(x1, x2, x3, x4));
    }
}