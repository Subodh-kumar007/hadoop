class multiThread1 extends Thread
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(500);
				System.out.println(" "+i);
			}
			catch(Exception E)
			{
				System.out.println("Exceptopm Caught");
			}
		}
	}
	public static void main(String[] args) {
		multiThread1 M1=new multiThread1();
		M1.start();
	
		multiThread1 M2=new multiThread1();
		M2.start();
	}
}
