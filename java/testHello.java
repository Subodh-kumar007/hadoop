interface test1
{
	void show();
	void display();
}
interface test2
{
	void show1();
	void display1();
}

class testInterface implements test1,test2
{
	public void show(){}
	public void display(){}


	public void show1(){}
	public void display1(){}
}
class testHello
{
	public static void main(String[] args) {
		testInterface T1=new  testInterface();

		T1.show();
	}
}
