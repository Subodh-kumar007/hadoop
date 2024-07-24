import java.util.*;
class testDivision1234
{
	public static void main(String[] args) {
		int a[]=new int[3];
		Scanner S=new Scanner(System.in);
		System.out.println("Enter numbers");
		a[0]=S.nextInt();
		a[1]=S.nextInt();
		try
		{
			a[2]=a[0]/a[1];
			System.out.println("Result: - "+a[2]);
		}
		catch(ArithmeticException E)
		{
			System.out.println("Exception Caught: -"+E);
		}
		finally
		{
			System.out.println("It is Compulsory Statement");
		}

	}
}