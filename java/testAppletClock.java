import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;
/*
<applet code="testAppletClock" height=500 width	=500></applet>
*/
public class testAppletClock extends Applet implements Runnable
{
	Thread T=null;
	int hours=0,min=0,sec=0;
	String timeString;

	public void init()
	{
		setBackground(Color.magenta);
	}
	public void start()
	{
		T=new Thread(this);
		T.start();
	}
	public void run()
	{
		try{
			while(true){
				Calendar cal=Calendar.getInstance();
				// hours=cal.get(Calendar.HOUR_OF_DAY);
				// //if(hours>12)
				// //	hours=hours-12;
				// min=cal.get(Calendar.MINUTE);
				// sec=cal.get(Calendar.SECOND);

				SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");

				Date date=cal.getTime();
				timeString=sdf.format(date);
				repaint();
				T.sleep(1000);
			}
		}
		catch(Exception E){

		}
	}
	public void paint(Graphics G)
	{
		G.setColor(Color.black);
		G.drawString(timeString,50,50);
	}
}