package Hunter;

import java.util.Scanner;

public class hunter96 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the string");
	String input=in.next();
	int n=input.length();
	int t=65;
	int y=97;
	char[] upp=new char[26];
	char[] low=new char[26];
	for(int i=0;i<26;i++){
		upp[i]=(char)t;
		low[i]=(char)y;
		t++;
		y++;
	}
	char[] ans=new char[input.length()];
	char[] arr=input.toCharArray();
	for(int i=0;i<arr.length-1;i++){
		char r=arr[i];
		for(int j=0;j<26;j++){
			if(r==upp[j]){
				int q=j-1;
				if(q<=0){
					ans[i]=upp[q+26];
				}
				else
				ans[i]=upp[j-1];
			}
			else if(r==low[j]){
				int w=j-1;
				if(w<=0){
					ans[i]=low[w+26];
					}
				else
				ans[i]=low[j-1];
			}
		}	
	}
	ans[n-1]=arr[n-1];
	String output="";
	for(int i=0;i<n;i++){
		output+=ans[i];
	}
	System.out.println(output);
}
}
