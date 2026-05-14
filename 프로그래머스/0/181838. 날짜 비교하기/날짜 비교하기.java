import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] date1, int[] date2) {
        for(int i = 0; i<3; i++){
            if(date1[i]<date2[i]){
                return 1;
            }
            else if(date1[i]>date2[i]){
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine(),"[], ");
        int[] date1 = new int[3];
        int[] date2 = new int[3];
        for(int i=0; i<3; i++){
            date1[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(),"[], ");
        for(int i=0; i<3; i++){
            date2[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(date1, date2));
    }
}