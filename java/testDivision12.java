import java.util.*;
class testDivision12
{
	public static void main(String[] args) {
		int a[]=new int[3];
		Scanner S=new Scanner(System.in);
		System.out.println("Enter numbers");
		a[0]=S.nextInt();
		a[1]=S.nextInt();
		try
		{
			a[3]=a[0]/a[1];
			System.out.println("Result: - "+a[2]);
		}
		catch(IndexOutOfBoundsException E)
		{
			System.out.println("Exception Caught: -"+E);
		}
	}
}