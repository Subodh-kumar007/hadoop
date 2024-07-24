class methodJoin extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try{
				System.out.println("Thread Name-"+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			catch(Exception E)
			{
				
				System.out.println("Exception");
			}
			System.out.println("Exit");
		}
	}
}
class testThread2
{
	public static void main(String[] args) {
		methodJoin th1=new methodJoin();
		methodJoin th2=new methodJoin();
		methodJoin th3=new methodJoin();

		th1.start();
		try{
			th1.join(1500);
		}
		catch(Exception E){
		
		}
		th2.start();
		th3.start();
		

	}
}