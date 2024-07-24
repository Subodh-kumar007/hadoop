//inheriting class from package
import myPackage.testPack;
import myPackage.testPack1;

class test extends testPack
{
	void display()
	{
		System.out.println("I am display from test Class");		
	}
}

class testMain3
{
	public static void main(String[] args) {
		test T=new test();
		T.show();
		T.display();
	}
}