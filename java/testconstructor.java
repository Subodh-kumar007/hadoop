//single Inheritance using constructor
//One Parent one chid

class detail
{
	int rno;
	String name;
	detail(int r,String n)
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

	teacher(int r,String n,String q,int s)
	{
		super(r,n);
		qualification=q;
		sal=s;
	}
	void showteacher()
	{
		System.out.println("Qualifcaiton:- "+qualification);
		System.out.println("Salary:- "+sal);
	}
}
class testconstructor
{
	public static void main(String[] args) {
		teacher T=new teacher(101,"Manish","BCA",9850);//will inovke child constructor
		System.out.println("Teacher Detail");
		T.showOutput();
		T.showteacher();
	}
}