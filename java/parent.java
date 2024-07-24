interface test
{
	void show();
	void display();
}
class testInterface implements test
{
	public void show(){}
	public void display(){}
}
class hello 
{
	public static void main(String[] args) {
		testInterface T1=new  testInterface();

		T1.show();
	}
}
