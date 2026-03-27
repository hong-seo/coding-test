import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] num_list, int n) {
        int j=0;
        int[] arr = new int[num_list.length-n+1];
        for(int i=n-1; i<num_list.length; i++){
            arr[j]=num_list[i];
            j++;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int n=Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(arr, n)));
    }
}