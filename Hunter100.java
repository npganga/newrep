package Hunter;

import java.util.Scanner;

public class Hunter100 {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int number=in.nextInt();
	int sum=0,c=0;
	for(int i=number;i>0;i=i/10){
		int r=i%10;
		int j=number;
		int y;
		if(c==0)
			 y=0;
		else{
			y=j%10;
		}
		int p=(int)Math.pow(r, y);
		System.out.println(p+"K");
		j=j/10;
		sum+=p;
		c++;
	}
	System.out.println(sum);
}
}
