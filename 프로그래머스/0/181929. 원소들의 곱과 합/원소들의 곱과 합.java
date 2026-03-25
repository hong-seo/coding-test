import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] num_list) {
        int count=num_list.length;
        int sum=0, mul=1;
        for(int i=0; i<count;i++){
            sum+=num_list[i];
            mul*=num_list[i];
        }
        return (sum*sum >mul) ? 1:0; 
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), ", ");
        int count=token.countTokens();
        int[] arr= new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(token.nextToken());
        }
        System.out.println(solution(arr));
    }
}