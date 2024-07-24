import java.util.*;
class testDivision
{
	public static void main(String[] args) {
		int a,b,c;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter numbers");
		a=S.nextInt();
		b=S.nextInt();
		try
		{
			c=a/b;
			System.out.println("Result: - "+c);
		}
		catch(ArithmeticException E)
		{
			System.out.println("Exception Caught: -"+E);
		}
	}
}