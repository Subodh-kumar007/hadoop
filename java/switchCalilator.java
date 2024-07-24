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
		switch(ch)
		{
		case '+':	c=a+b;
			System.out.println("Result:- "+c);
			break;
		case '-':
			c=a-b;
			System.out.println("Result:- "+c);
			break;
		case '*':
			c=a*b;
			System.out.println("Result:- "+c);
			break;
		case '/':
			c=a/b;
			System.out.println("Result:- "+c);			
			break;
		case '%':
			c=a%b;
			System.out.println("Result:- "+c);
			break;
		default:
			System.out.println("Invalid Symbol");
		}
	}
}