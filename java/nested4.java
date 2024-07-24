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

	void readOuter(int r,int m)
	{
		a=r;
	}
	void showOuter()
	{	
		System.out.println("I am Show from Outer"+a);
		//In.showInner(); will error
	}
}
class nested4
{
	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.readOuter(10,20);
		//obj.showInner();Will give Error
		obj.showOuter();

		/*
			Inner In=new Inner();
			In.showInner();
			In.showOuter();
			*/
	}
}