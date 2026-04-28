import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.*;

public class Solution {
    public static int solution(int a, int b, int c) {
        double answer = 0;
        if(a==b&&a==c&&b==c){
            answer=(a+b+c)*(Math.pow(a,2) + Math.pow(b,2)+Math.pow(c,2))*(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        }else if(a!=b&&a!=c&&b!=c){
            answer=a+b+c;
        }else{
            answer=(a+b+c)*(Math.pow(a,2) + Math.pow(b,2)+Math.pow(c,2));
        }
        return (int)answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        System.out.println(solution(a, b, c));

    }
}