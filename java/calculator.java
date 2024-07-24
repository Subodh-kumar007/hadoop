import java.util.*;
class calculator
{
	public static void main(String[] args) {
		int a,b,c=0;
		char ch;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=S.nextInt();
		b=S.nextInt();
		System.out.println("Enter operator for operation");
		ch=S.next().charAt(0);
		if(ch=='+')
		{
			c=a+b;
		}
		else if(ch=='-')
		{
			c=a-b;
		}			
		else if(ch=='*')
		{
			c=a*b;
		}
		else if(ch=='/')
		{
			c=a/b;
		}
		else if(ch=='%')
		{
			c=a%b;
		}
		else
		{
			System.out.println("Invalid Symbol");
		}
		if (c>0||c<0)
		{
			System.out.println("rESULT IS "+c);
		}
	}
}