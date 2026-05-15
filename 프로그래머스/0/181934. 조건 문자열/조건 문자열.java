import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals("<")){
            if(eq.equals("=")){
                if(n <= m){
                    return 1;
                }
            }
            else{
                if(n < m){
                    return 1;
                }
            }
        }
        else{
            if(eq.equals("=")){
                if(n >= m){
                    return 1;
                }
            }
            else{
                if(n > m){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ineq = br.readLine().replace("\"","");
        String eq = br.readLine().replace("\"","");
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        System.out.println(solution(ineq, eq, n, m));
    }
}