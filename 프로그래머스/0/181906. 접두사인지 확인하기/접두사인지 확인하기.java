import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String my_string, String is_prefix) {
        if(my_string.length()<is_prefix.length()){
            return 0;
        }
        for(int i=0; i<is_prefix.length(); i++){
            if(my_string.charAt(i)!=is_prefix.charAt(i)){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mystring = br.readLine().replace("\"", "");
        String prefix = br.readLine().replace("\"", "");
        System.out.println(solution(mystring, prefix));
    }
}