/*
implementing dynamic Array
*/
import java.util.*;
class array3
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int i,size,s;

		System.out.println("Enter size of an array");
		size=S.nextInt();

		int a[]=new int[size];

		System.out.println("Enter elements in array");
		for(i=0;i<size;i++)
		{
			a[i]=S.nextInt();
		}

		s=0;
		for(i=0;i<size;i++)
		{
			if(a[i]%2==0)
				s=s+a[i];
		}
		System.out.println("sum of Even Element "+s);			

	}
}