import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }
}