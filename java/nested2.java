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
			System.out.println("I am Show from Inner"+b);
		}
	}

	Inner In=new Inner();

	void readOuter(int r,int m)
	{
		a=r;
		In.readInner(m);

	}
	void showOuter()
	{	
		System.out.println("I am Show from Outer"+a);
		In.showInner();
	}
}
class nested2
{
	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.readOuter(10,20);
		//obj.showInner();Will give Error
		obj.showOuter();
	}
}