import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String my_string, String target) {
        int n=my_string.length();
        int m=target.length();
        if(m>n){
            return 0;
        }
        for(int i=0; i<=n-m; i++){
            boolean match = true;
            for(int j=0; j<m; j++){
                if(my_string.charAt(i+j)!=target.charAt(j)){
                    match=false;
                    break;
                }
            }
            if(match){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String target = br.readLine();
        System.out.println(solution(str, target));

    }
}