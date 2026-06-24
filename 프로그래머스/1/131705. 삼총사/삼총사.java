import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] number) {
        int zero=0;
        int answer = 0;
        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    zero=number[i]+number[j]+number[k];
                    if(zero==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.substring(1,str.length()-1);
        StringTokenizer st = new StringTokenizer(str,", ");
        int count = st.countTokens();
        int[] number = new int[count];
        for(int i=0; i<count; i++){
            number[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(number));
    }
}