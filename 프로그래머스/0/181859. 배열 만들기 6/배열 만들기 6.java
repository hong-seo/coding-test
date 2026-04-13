import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr) {
        int[] stk = {};
        int i=0;
        do{
            if(stk.length==0){
                stk=new int[]{arr[i]};
                i++;
            }
            else if(stk[stk.length-1]==arr[i]){
                stk = Arrays.copyOfRange(stk, 0, stk.length-1);
                i++;
            }
            else{
                stk = Arrays.copyOf(stk, stk.length+1);
                stk[stk.length-1]=arr[i];
                i++;
            }
        }while(i<arr.length);
        if(stk.length==0){
            stk=new int[]{-1};
        }
        return stk;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(",");
        int[] arr = new int[str.length];
        for(int i=0; i<str.length; i++){
            arr[i]=Integer.parseInt(str[i].trim());
        }
        System.out.println(Arrays.toString(solution(arr)));
    }
}