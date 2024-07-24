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
	void readOuter(int r)
	{
		a=r;
	}
	void showOuter()
	{	
		System.out.println("I am Show from Outer"+a);
	}
}
class nested1
{
	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.readOuter(10);
		//obj.showInner();Will give Error
		obj.showOuter();
	}
}