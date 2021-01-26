package InterviewPrepKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SalesByMatch {
	static int sockMerchant(int n, int[] ar) {
        Set<Integer>s = new HashSet<>();
        for(int i: ar) {
            s.add(i);
        }
        Integer [] arr = new Integer[s.size()];
        int k = 0;
        for(Integer i : s) {
            arr[k++] = i;
        }
        int count=0; 
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i]==ar[j]) {
                    count++;
                }
            }
            if(count>1) {
                sum+= count/2;
            }
            count = 0;
        }
        return sum;
    }
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
  }
}