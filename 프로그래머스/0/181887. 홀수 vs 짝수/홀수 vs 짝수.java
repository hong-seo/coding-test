import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] num_list) {
        int odd=0, even=0;
        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                even += num_list[i];
            }
            else{
                odd += num_list[i];
            }
        }
        return even>odd ? even : odd;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));
    }
}