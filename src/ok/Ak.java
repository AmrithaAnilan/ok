
package ok;

import java.util.Scanner;
public class Ak {

public class Avenarrayelements {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the limit");
		int n=sc.nextInt();
		int b[]=new int[n];
		System.out.println("enter the values");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				System.out.print(b[i]+" ");
			}
		}
	}

}


}
