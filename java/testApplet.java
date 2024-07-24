import java.applet.*;
import java.awt.*;
/*
<applet code="testApplet" height=400 width=400></applet>
*/
public class testApplet extends Applet
{
	public void paint(Graphics G)
	{
		G.drawString("Hello..! Welcome to Java Applet",20,30);
	}
}