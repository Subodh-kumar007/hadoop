class methodJoin extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try{
				System.out.println("Thread Name-"+Thread.currentThread().getName());
				Thread.sleep(250);
			}
			catch(Exception E)
			{
				
				System.out.println("Exception");
			}
				System.out.println("Exin");
		}
	}
}
class testThread1
{
	public static void main(String[] args) {
		methodJoin th1=new methodJoin();
		methodJoin th2=new methodJoin();
		methodJoin th3=new methodJoin();

		th1.start();
		try{
			th1.join();			;
		}
		catch(Exception E){
		
		}
		th2.start();
		th3.start();
		

	}
}