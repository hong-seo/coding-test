import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr, int[] query) {
        int[] answer = {}; 
        int count = arr.length;
        for(int i=0; i<query.length; i++){
            if(i%2==0){ //뒤 자르기
                if(i==0){
                    answer = Arrays.copyOfRange(arr, 0, query[i]+1);
                }
                else{
                    answer = Arrays.copyOfRange(answer, 0, query[i]+1); 
                }
            }
            else{ //앞 자르기
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "[], ");
        int count = st.countTokens();
        int[] arr =new int[count];
        for(int i=0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(),"[], ");
        count = st.countTokens();
        int[] query =new int[count];
        for(int i=0; i<count; i++){
            query[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(solution(arr, query)));
    }
}