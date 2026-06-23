import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<attendance.length; i++){
            if(attendance[i]){
                arr.add(i);
            }
        }
        for(int i=0; i<arr.size(); i++){
            list.add(rank[arr.get(i)]);
        }
        Collections.sort(list);
        int[] ans = new int[3];
        for(int i=0; i<3; i++){
            for(int j=0; j<rank.length; j++){
                if(list.get(i)==rank[j]){
                    ans[i]=j;
                }
            }
        }
        int answer = 10000*ans[0] + 100*ans[1] + ans[2];
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Rank = br.readLine();
        Rank = Rank.substring(1,Rank.length()-1);
        StringTokenizer st = new StringTokenizer(Rank,", ");
        int count = st.countTokens();
        int[] rank = new int[count];
        for(int i=0; i<count; i++){
            rank[i]=Integer.parseInt(st.nextToken());
        }
        String att = br.readLine();
        att = att.substring(1,att.length()-1);
        st = new StringTokenizer(att,", ");
        count = st.countTokens();
        boolean[] attendance = new boolean[count];
        for(int i=0; i<count; i++){
            attendance[i]= Boolean.valueOf(st.nextToken());
        }
        System.out.println(solution(rank, attendance));
    }
}