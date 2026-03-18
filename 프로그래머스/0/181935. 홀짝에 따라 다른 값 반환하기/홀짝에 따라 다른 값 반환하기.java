import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(int n) {
        int sum=0;
        if(n%2==0){
            for(int i=0; i<=n; i+=2){
                sum+=i*i;
            }
        }
        else{
            for(int i=1; i<=n; i+=2){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(solution(n));

    }
}