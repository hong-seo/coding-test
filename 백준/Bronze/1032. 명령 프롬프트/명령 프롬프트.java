import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        int max=0;
        for(int i=0; i<n; i++){
            String st = new String(br.readLine());
            str[i] = st;
            if(max<st.length()){
                max=st.length();
            }
        }

        StringBuilder sb = new StringBuilder();

        // 표본
        char[] c = new char[max];
        for(int i =0; i<max; i++){
            c[i] = str[0].charAt(i);
        }


        for(int i=0; i<max; i++){
            for(int j=0; j<n; j++){
                if(str[0].charAt(i) != str[j].charAt(i)){
                    sb.append("?");
                    break;
                }
                if(j==n-1){
                    sb.append(str[0].charAt(i));
                }
            }
        }

        System.out.println(sb.toString());

    }
}