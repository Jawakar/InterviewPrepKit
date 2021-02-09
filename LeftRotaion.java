package InterviewPrepKit;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotaion {
	static int[] rotLeft(int[] a, int rotation) {
        int len = a.length;
        int [] arr = new int[len];
        int modVal = rotation%len;
        int indexValIncreamenter = 0;
        for(int i=modVal, j=0; i<len; i++,j++){
            arr[j] = a[i];
            indexValIncreamenter+=1;
        }
        for(int i=indexValIncreamenter, j=0; i<len; i++,j++){
            arr[i] = a[j];
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int noOfRotation = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(rotLeft(arr,noOfRotation)));
	}

}
