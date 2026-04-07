import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] arr1, int[] arr2) {
        int sum1=0, sum2=0;
        if(arr1.length> arr2.length){
            return 1;
        }
        else if(arr1.length < arr2.length){
            return -1;
        }
        else{
            for(int i=0; i<arr1.length; i++){
                sum1+=arr1[i];
                sum2+=arr2[i];
            }
            if(sum1 < sum2){
                return -1;
            }
            else if(sum1 > sum2){
                return 1;
            }
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(),", ");
        int count1 = st1.countTokens();
        int[] arr1 = new int[count1];
        for(int i=0; i<count1; i++){
            arr1[i]=Integer.parseInt(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine(),", ");
        int count2 = st2.countTokens();
        int[] arr2 = new int[count2];
        for(int i=0; i<count2; i++){
            arr2[i]=Integer.parseInt(st2.nextToken());
        }
        System.out.println(solution(arr1, arr2));
    }
}