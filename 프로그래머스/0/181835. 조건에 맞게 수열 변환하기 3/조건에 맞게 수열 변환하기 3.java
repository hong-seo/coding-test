import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, int k) {
        if(k%2==0){
            for(int i=0; i<arr.length; i++){
                arr[i]+=k;
            }
        }
        else{
            for(int i=0; i<arr.length; i++){
                arr[i]*=k;
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");
        int count = st.countTokens();
        int[] arr=new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(arr, k)));
    }
}