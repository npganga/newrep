package Hunter;

import java.util.Scanner;

public class Hunter68 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int q=0;
	int[] array=new int[n];
	int[] ans=new int[n-1];
	for(int i=0;i<n;i++){
		array[i]=in.nextInt();
	}
	for(int i=0;i<n-1;i++){
		int j=i+1;
			if(array[i]<array[j]){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				q=1;
			}
			int g=array[i]-array[j];
			ans[i]=g;
			if(q==1){
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			}
	}
	int output=0;
	int max=ans[0];
	int s=0;
	for(int i=0;i<n-1;i++){
	if(max<ans[i]){
		max=ans[i];
		s=i;
	}
	}
	if(array[s]>array[s+1]){
		output=array[s];
	}
	else{
		output=array[s+1];
	}
	System.out.println(output);
	in.close();
}
}
