import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] num_list) {
        for(int j=0; j<num_list.length-1; j++){
            for(int i=0; i<num_list.length-j-1; i++){
                if(num_list[i]>num_list[i+1]){
                    int max=num_list[i];
                    num_list[i] = num_list[i+1];
                    num_list[i+1] = max;
                }
            }
        }
        int[] subArray = Arrays.copyOfRange(num_list, 5,num_list.length);
        return subArray;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(solution(arr)));
    }
}