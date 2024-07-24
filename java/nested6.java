class Outer
{
	static int a;
	static class Inner
	{
		int b;
		void readInner(int r,int m)
		{
			b=r;
			a=m;
		}
		void showInner()
		{
			System.out.println("I am Show from Outer"+a);
			System.out.println("I am Show from Inner"+b);
		}
	}
}
class nested6
{
	public static void main(String[] args) {
		//Outer obj=new Outer();
		
		Outer.Inner In=new Outer.Inner();
		In.readInner(10,20);
		In.showInner();
	}
}