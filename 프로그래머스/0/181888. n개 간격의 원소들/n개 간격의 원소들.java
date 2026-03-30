import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] num_list, int n) {
        int count = num_list.length;
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0; i<count; i+=n){
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),", ");
        int count = st.countTokens();
        int[] arr=new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int n = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(arr, n)));
    }
}