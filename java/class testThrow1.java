import java.util.*;
class testThrow1
{
	static void show(int a[])throws Exception
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter index for data");
		int n=S.nextInt();
		int i;
		i=a[n]/a[4]-(a[2]+a[0]);
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