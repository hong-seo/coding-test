import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(int a, int b) {
        if(a%2==0 && b%2==0){
            if(a>=b){
                return a-b;
            }
            else{
                return b-a;
            }
        }
        else if(a%2!=0 && b%2!=0){
            return (int)Math.pow(a,2)+(int)Math.pow(b,2);
        }
        else{
            return 2*(a+b);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        System.out.println(solution(a,b));
    }
}