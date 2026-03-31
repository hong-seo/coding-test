import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int solution(String my_string, String is_suffix) {
        int count1 = my_string.length();
        int count2 = is_suffix.length();
        if(count1<count2){
            return 0;
        }
        for(int i=1; i<=count2; i++){
            if(my_string.charAt(count1-i)!=is_suffix.charAt(count2-i)){
            return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my = br.readLine();
        String suffix = br.readLine();
        System.out.println(solution(my,suffix));
    }
}