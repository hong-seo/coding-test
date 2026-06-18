import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static String[] solution(String[] picture, int k) {
        int row = picture.length;
        String[] answer = new String[row*k];
        int count=0;
        for(int i=0; i<row; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<picture[0].length(); j++){
                for(int n=0; n<k; n++){
                    sb.append(picture[i].charAt(j));
                }
            }
            for(int l=count; l<count+k; l++){
                answer[l]=sb.toString();
            }
            count+=k;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str= str.substring(2, str.length()-2);
        String[] arr = str.split("\", \"");
        StringTokenizer st = new StringTokenizer(str,"\", \"");
        int k = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(arr, k)));
    }
}