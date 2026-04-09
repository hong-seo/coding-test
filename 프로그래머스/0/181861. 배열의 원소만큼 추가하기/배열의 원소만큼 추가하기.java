import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int count = arr.length;
        for(int i=0; i<count; i++){
            for(int j=0; j<arr[i]; j++){
                al.add(arr[i]);
            }
        }
        return al.stream().mapToInt(n -> n).toArray();
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