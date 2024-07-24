class detail
{
	int rno;
	String name;
	void readInput(int r,String n)
	{
		rno=r;
		name=n;
	}
	void showOutput()
	{
		System.out.println("ID:- "+rno);
		System.out.println("Name:- "+name);
	}
}

class teacher extends detail
{
	int sal;
	String qualification;

	void readteacher(String q,int s)
	{
		qualification=q;
		sal=s;
	}
	void showteacher()
	{
		System.out.println("Qualifcaiton:- "+qualification);
		System.out.println("Salary:- "+sal);
	}
}
class testTeacher1
{
	public static void main(String[] args) {
		teacher T=new teacher();
		T.readInput(101,"Manish");
		T.readteacher("BCA",9850);
		System.out.println("Teacher Detail");
		T.showOutput();
		T.showteacher();
	}
}