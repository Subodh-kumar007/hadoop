class multiThread4 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is accessible");
	}
	public static void main(String[] args) {
		multiThread4 M1=new multiThread4();
		Thread T1=new Thread(M1);

		multiThread4 M2=new multiThread4();
		Thread T2=new Thread(M2,"userThread");
		T2.start();

		System.out.println(T1.getName());
		System.out.println(T2.getName());
	}
}