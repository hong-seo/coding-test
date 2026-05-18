import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] num_list) {
        int count=0;
        for(int i=0; i<num_list.length; i++){
            int num = num_list[i];
            while(num > 1){
                if(num%2==0){
                    num=num/2;
                }
                else{
                    num=(num-1)/2;
                }
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        num = num.substring(1,num.length()-1);
        StringTokenizer st = new StringTokenizer(num,", ");
        int count = st.countTokens();
        int[] num_list = new int[count];
        for(int i=0; i<count; i++){
            num_list[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(num_list));
    }
}