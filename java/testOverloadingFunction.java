import java.util.*;
class figure
{
	int a,b,ar;
	//function with 1 integer argument
	void area(int m)
	{
		a=m;
		ar=22*a*a/7;
		System.out.println("Area of Circle:- "+ar);
	}
	//function with 2 integer argument
	void area(int m, int n)
	{
		a=m;
		b=n;
		ar=a*b;
		System.out.println("Area of rectangle:- "+ar);	
	}
	//function with 1 String argument
	void area(String m)
	{
		a=Integer.parseInt(m);
		ar=a*a;
		System.out.println("Area of Square:- "+ar);
	}
	//function with 2 String argument
	void area(String m,String n)
	{
		a=Integer.parseInt(m);
		b=Integer.parseInt(n);
		ar=(a*b)/2;
		System.out.println("Area of Triangle:- "+ar);
	}
}
class testOverloadingFunction
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);

		figure T=new figure();
		T.area(args[0],args[1]);
		figure s=new figure();
		s.area(args[0]);

		System.out.println("Enter Values for figure" );	
		int m;int n;
		m=S.nextInt();
		n=S.nextInt();

		figure R=new figure();
		R.area(m,n);
		figure C=new figure();
		C.area(m);
	}
}
