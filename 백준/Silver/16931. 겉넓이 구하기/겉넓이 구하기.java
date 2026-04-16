import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            StringTokenizer ar = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                arr[i][j]= Integer.parseInt(ar.nextToken());
            }
        }
        int count =0;
        int up = N*M*2;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int current = arr[i][j];

                //왼쪽면
                if(j==0){
                    count+=current;
                }
                else if(current> arr[i][j-1]){
                    count += (current-arr[i][j-1]);
                }

                //오른쪽
                if(j==M-1){
                    count+=current;
                }
                else if(current> arr[i][j+1]){
                    count += (current-arr[i][j+1]);
                }

                //앞
                if(i==N-1){
                    count+=current;
                }
                else if(current> arr[i+1][j]){
                    count += (current-arr[i+1][j]);
                }

                //뒤
                if(i==0){
                    count+=current;
                }
                else if(current> arr[i-1][j]){
                    count += (current-arr[i-1][j]);
                }
            }
        }
        System.out.println(count+up);
    }
}