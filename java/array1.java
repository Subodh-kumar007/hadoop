/*
Arrays:- WAP to read 10 elements from the user and print them.
*/
import java.util.*;
class array1
{
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner S=new Scanner(System.in);
		int i;
		System.out.println("Enter elements in array");
		for(i=0;i<5;i++)
		{
			a[i]=S.nextInt();
		}

		System.out.println("Enter elements in array");

		for(i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}