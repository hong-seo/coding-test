import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            for(int k=intervals[i][0]; k<=intervals[i][1]; k++){
                list.add(arr[k]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),",[] ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(),"[], ");
        count = st.countTokens()/2;
        int[][] intervals = new int[count][2];
        for(int i=0; i<count; i++){
            for(int j=0; j<2; j++){
                intervals[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(Arrays.toString(solution(arr, intervals)));
    }
}