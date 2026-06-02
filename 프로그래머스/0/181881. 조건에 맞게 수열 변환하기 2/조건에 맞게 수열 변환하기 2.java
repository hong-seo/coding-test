import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] arr) {
        int count=0;
        while(true){
            int[] copy = arr.clone();
            for(int i=0; i<arr.length; i++){
                int k= arr[i];
                if(k<50 && (k%2!=0)){
                    k=k*2+1;
                }
                else if(k>=50 && (k%2==0)){
                    k=k/2;
                }
                arr[i]=k;
            }
            if (Arrays.equals(arr, copy)) {
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.substring(1,str.length()-1);
        StringTokenizer st = new StringTokenizer(str,", ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));
    }
}