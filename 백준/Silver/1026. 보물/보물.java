import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A  = new int[n];
        int[] B = new int[n];
        StringTokenizer stA = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(stA.nextToken());
        }
        StringTokenizer stB = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            B[i] = Integer.parseInt(stB.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=(A[i]*B[n-i-1]);
        }
        System.out.println(sum);
    }
}