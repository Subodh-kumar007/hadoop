/*Loops in java
for
while
do-while
*/
import java.util.*;
class forLoopPrime
{
	public static void main(String[] args) {
		Scanner S=new Scanner (System.in);
		int n1,n2,a,r;
		System.out.println("Enter Number");
		n1=S.nextInt();

		for(a=2;a<n1;a++)
		{
			if(n1%a==0)
			{
				System.out.println("Not Prime");
				break;
			}
		}
		if(n1==a)
		{
			System.out.println("It is Prime");
		}
	}
}