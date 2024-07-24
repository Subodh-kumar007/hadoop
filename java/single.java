class student
{
	int rno,fee;
	String name,course;
	void readInput(int r,String n,String c,int f)
	{
		rno=r;
		name=n;
		course=c;
		fee=f;
	}
	void showOutput()
	{
		System.out.println("Rollno:- "+rno);
		System.out.println("Name:- "+name);
		System.out.println("Course:- "+course);
		System.out.println("Fee:- "+fee);
	}
}
class testStudent
{
	public static void main(String[] args) {
		student S=new student();
		S.readInput(101,"Manish","BCA",8500);
		System.out.println("Student Detail");
		S.showOutput();
	}
}