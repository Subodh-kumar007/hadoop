//Hieracrhcial Inheritance
//One Parent Multipal childtren chid

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

class student extends detail
{
	int fee;
	String course;
	void readStudent(String c,int f)
	{
		course=c;
		fee=f;
	}
	void showStudent()
	{
		System.out.println("Course:- "+course);
		System.out.println("Fee:- "+fee);
	}
}
class testTeacher2
{
	public static void main(String[] args) {


		teacher T=new teacher();
		T.readInput(101,"Manish");
		T.readteacher("BCA",9850);
		System.out.println("Teacher Detail");
		T.showOutput();
		T.showteacher();


		student S=new student();
		S.readInput(101,"Manish");
		S.readStudent("BCA",9850);
		System.out.println("Student Detail");
		S.showOutput();
		S.showStudent();		
	}
}