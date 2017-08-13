package Hunter;

import java.util.Scanner;

public class Hunter21 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0;i<n;i++){
    	for(int j=0;j<n;j++){
    		arr[i][j]=in.nextInt();
    	}
    }
    int c=0;
    int e=n*n;
    for(int i=0;i<n;i++){
    	for(int j=0;j<n;j++){
    		if(arr[i][j]==0||arr[i][j]==1){
    			c++;
    		}
    	}
    }
    int[][] r=new int[n][n];
    if(c==e){
    for(int i=0;i<n;i++){
    	for(int j=0;j<n;j++){
    		if(arr[0][j]==0||arr[i][0]==0){
    			r[i][j]=0;
    		}
    		else{
    			r[i][j]=arr[i][j];
    		}
    		System.out.print(r[i][j]+" ");
    	}
    	System.out.println();
    }
    }
    else{
    	System.out.println("Invlid data");
    }
}
}
