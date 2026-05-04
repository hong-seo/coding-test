import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int[] arr) {
        int min=arr.length,max=-1;
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                if(i<min){
                    min =i;
                }
                if(i>max){
                    max=i;
                }
                count++;
            }
        }
        int size=1;
        if(max-min+1>0){
            size=max-min+1;
        }
        int[] answer = new int[size];
        if(count>1){
            for(int i=min; i<max+1; i++){
                answer[i-min]=arr[i];
            }
        }
        else if(count==1){
            answer[0]=2;
        }
        else{
            answer[0]=-1;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"[], ");
        int count = st.countTokens();
        int[] arr = new int[count];
        for(int i =0; i<count; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(solution(arr)));

    }
}