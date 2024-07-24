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
class testThread4
{
	public static void main(String[] args) {
		methodJoin th1=new methodJoin();
		methodJoin th2=new methodJoin();
		methodJoin th3=new methodJoin();

		th1.setName("First");
		th2.setName("SEcond:");
		th3.setName("third");

		System.out.println("tH1 Priority:- "+th1.getPriority());
		System.out.println("tH2 Priority:- "+th2.getPriority());		
		System.out.println("tH3 Priority:- "+th3.getPriority());		
		
		th1.setPriority(2);
		th2.setPriority(8);
		th3.setPriority(5);
		
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


