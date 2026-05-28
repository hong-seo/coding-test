import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr) {
        ArrayList<Integer> ar = new ArrayList<>();
        int len = arr.length;
        int alen =1;
        while(len>alen){
            alen*=2;
        }
        int c = alen-len;
        for(int i=0; i<len; i++){
            ar.add(arr[i]);
        }
        for(int i=0; i<c; i++){
            ar.add(0);
        }
        return ar.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        line = line.substring(1, line.length()-1);
        StringTokenizer st = new StringTokenizer(line,", ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(solution(arr)));
    }
}