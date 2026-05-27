import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a= slicer[0];
        int b= slicer[1];
        int c= slicer[2];
        ArrayList<Integer> arr =new ArrayList<>();
        switch (n) {
            case 1:
                for(int i=0; i<=b; i++){
                    arr.add(num_list[i]);
                }
                break;
            case 2:
                for(int i=a; i<num_list.length; i++){
                    arr.add(num_list[i]);
                }
                break;
            case 3:
                for(int i=a; i<=b; i++){
                    arr.add(num_list[i]);
                }
                break;
            case 4:
                for(int i=a; i<=b; i+=c){
                    arr.add(num_list[i]);
                }
                break;
        }
        return arr.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());	
        String slice = br.readLine();
        slice = slice.substring(1, slice.length()-1);
        StringTokenizer st = new StringTokenizer(slice,", ");
        int[] slicer = new int[3];
        for(int i=0; i<3; i++){
            slicer[i] =Integer.parseInt(st.nextToken());
        }
        String num = br.readLine();
        num = num.substring(1, num.length() - 1);
        st = new StringTokenizer(num,", ");
        int count = st.countTokens();
        int[] num_list = new int[count];
        for(int i=0; i<count; i++){
            num_list[i] =Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(solution(n, slicer, num_list)));
    }
}