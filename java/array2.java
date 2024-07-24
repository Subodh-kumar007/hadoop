/*
implementing dynamic Array
*/
import java.util.*;
class array2
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int i,size;

		System.out.println("Enter size of an array");
		size=S.nextInt();

		int a[]=new int[size];

		System.out.println("Enter elements in array");
		for(i=0;i<size;i++)
		{
			a[i]=S.nextInt();
		}

		System.out.println("Enter elements in array");

		for(i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}