import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;;

public class Solution {
    public static int solution(int a, int d, boolean[] included) {
        int count = included.length;
        int sum=0;
        int[] arr =new int[count];
        for(int i=0; i<count; i++){
            arr[i]=a+(d*i);
        }
        for(int i=0; i<count; i++){
            if(included[i]){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(),"[], ");
        int count = st.countTokens();
        boolean[] included = new boolean[count];
        for(int i=0; i<count; i++){
            included[i]=Boolean.parseBoolean(st.nextToken());
        }
        System.out.println(solution(a, b, included));
    }
}