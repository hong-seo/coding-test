import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])&&count<k){
                list.add(arr[i]);
                count++;
            }
        }
        while(count<k){
            list.add(-1);
            count++;
        }
        return list.stream().mapToInt(i->i).toArray();
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
        int k = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(arr, k)));
    }
}