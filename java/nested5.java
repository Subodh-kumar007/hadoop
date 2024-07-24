class Outer
{
	int a;
	class Inner
	{
		int b;
		void readInner(int r)
		{
			b=r;
		}
		void showInner()
		{
			System.out.println("I am Show from Outer"+a);
			System.out.println("I am Show from Inner"+b);
		}
	}

	Inner In = new Inner();

	void readOuter(int r,int m)
	{
		a=r;
		In.readInner(m);
	}
	void showOuter()
	{	
		//System.out.println("I am Show from Outer"+a);
		System.out.println("I am Show from Inner"+b);
		In.showInner();
	}
}
class nested5
{
	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.readOuter(10,20);
		//obj.showInner();Will give Error
		obj.showOuter();

		/*
		Statement  ot allowed will give error
			Inner In=new Inner();
			In.showInner();
			In.showOuter();
		*/
	}
}