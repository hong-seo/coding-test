import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = i;
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1]; 
            }
            return o1[0] - o2[0]; 
        });

        int[] P = new int[N];
        for(int i = 0; i < N; i++){
            P[arr[i][1]] = i; 
        }
        for(int i=0; i<N; i++){
            System.out.print(P[i]+" ");
        }
    }
}