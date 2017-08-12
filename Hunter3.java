package Hunter;

import java.util.Scanner;

public class Hunter3 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] array=new int[n];
	for(int i=0;i<n;i++){
		array[i]=in.nextInt();
	}
	for(int i=0;i<n;i++){
		if(array[i]==i){
			System.out.println("The number "+array[i]+" is equal to the index of "+i);
		}
	}
}
}
