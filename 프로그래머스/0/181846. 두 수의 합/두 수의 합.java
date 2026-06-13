import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;

public class Solution {
    public static String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        String answer = A.add(B).toString(0);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        a  = a.substring(1,a.length()-1);
        String b = br.readLine();
        b  = b.substring(1,b.length()-1);
        System.out.println(solution(a, b));
    }
}