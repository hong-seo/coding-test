import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=50 && arr[i]%2==0){
                arr[i]=arr[i]/2;
            }
            else if(arr[i]<50 && arr[i]%2!=0){
                arr[i]=arr[i]*2;
            }
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
        System.out.println(Arrays.toString(solution(arr)));
    }
}