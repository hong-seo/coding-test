import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] arr = new int[len+1];
        int last = num_list[len-1];
        int prev = num_list[len-2];
        for(int i=0; i<len; i++){
            arr[i]=num_list[i];
        }
        if(last>prev){
            arr[len]=last-prev;
        }
        else{
            arr[len]=last*2;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ,");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(solution(arr)));
    }
}