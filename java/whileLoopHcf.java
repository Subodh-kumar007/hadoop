/*Loops in java
for
while
do-while
*/
import java.util.*;
class whileLoopHcf
{
	public static void main(String[] args) {
		Scanner S=new Scanner (System.in);
		int n1,n2,a,r,c,hcf=0;
		System.out.println("Enter Number");
		n1=S.nextInt();
		n2=S.nextInt();
		/*
			24,32
			2 3 4 6 8 12 24
			2 4 8 16 32
		*/

		if(n1<n2)
		{
			a=n1;
			r=n2;
		}
		else
		{
			a=n2;
			r=n1;
		}
		c=1;
		while (c<=a)
		{
			if(n1%c==0 && n2%c==0)
			{
				hcf=c;
			}
			c++;
		}
		System.out.println(hcf);
	}
}