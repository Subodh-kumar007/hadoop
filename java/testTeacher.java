class teacher
{
	int rno,salary;
	String name,qualification;
	void readInput(int r,String n,String c,int s)
	{
		rno=r;
		name=n;
		qualification=c;
		salary=s;
	}
	void showOutput()
	{
		System.out.println("ID:- "+rno);
		System.out.println("Name:- "+name);
		System.out.println("Qualifcaiton:- "+qualification);
		System.out.println("Salary:- "+salary);
	}
}
class testTeacher
{
	public static void main(String[] args) {
		teacher T=new teacher();
		T.readInput(101,"Manish","BCA",9850);
		System.out.println("Teacher Detail");
		T.showOutput();
	}
}