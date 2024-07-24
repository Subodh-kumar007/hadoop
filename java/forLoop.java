/*Loops in java
for
while
do-while
*/
import java.util.*;
class forLoop
{
	public static void main(String[] args) {
		Scanner S=new Scanner (System.in);
		int n1,n2,a,r;
		System.out.println("Enter Number");
		n1=S.nextInt();
		n2=S.nextInt();
		if(n1<n2)
		{
			for(a=n1;a<=n2;a++)
			{
				System.out.println(a);
			}
		}
		else
		{
			for(a=n2;a<=n1;a++)
			{
				System.out.println(a);
			}
		}
	}
}