package Hunter;

import java.util.Scanner;

public class hUNTER63 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] arr1=new int[n];
	int[] arr2=new int[n];
	for(int i=0;i<n;i++){
		arr1[i]=in.nextInt();
	}
	int max=0;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(max<arr1[j]){
				max=arr1[j];
			}
		}
		arr2[i]=max;
		max=0;
	System.out.print(arr2[i]+" ");
	}
}
}
