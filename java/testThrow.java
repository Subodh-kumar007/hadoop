import java.util.*;
class testThrow
{
	static void show(int a[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter index for data");
		int n=S.nextInt();
		int i;
		try
		{
			i=a[n]/a[4]-(a[2]+a[0]);
			System.out.println("Rsult:- "+i);
		}
		catch(Exception E)
		{
			throw E;
		}
	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		
		try{
			show(a);
		}
		catch( Exception E)
		{
			System.out.println(E);;;
		}
	}
}