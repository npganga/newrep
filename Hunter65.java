package Hunter;

import java.util.Scanner;

public class Hunter65 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int t=in.nextInt();
	int[] array1=new int[t];
	int c=0;
	int[] ans=new int[t];
	for(int i=0;i<t;i++){
		array1[i]=in.nextInt();
      if(array1[i]!=n){
    	  ans[c]=array1[i];
    	  ++c;
      }
}
	for(int i=0;i<c;i++){
		System.out.println(ans[i]);
	}
}
}