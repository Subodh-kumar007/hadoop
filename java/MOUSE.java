import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=MOUSE height=500 width = 500>
</applet>*/
public class MOUSE extends Applet implements MouseListener, MouseMotionListener
{
	String msg=" ";
	int x=0,y=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent ME)
	{
		x=0;y=10;
		msg="Mouse is Clicked";
		repaint();
	}

	public void mouseEntered(MouseEvent ME)
	{
		x=100;y=100;
		msg="Mouse is inside Applet";
		repaint();
	}

	public void mouseExited(MouseEvent ME)
	{
		x=200;y=100;
		msg="Mouse is Outside Applet";
		repaint();
	}

	public void mousePressed(MouseEvent ME)
	{
		x=ME.getX();
		y=ME.getY();
		msg="Mouse Button is Pressed";
		repaint();
	}

	public void mouseReleased(MouseEvent ME)
	{
		x=ME.getX();
		y=ME.getY();
		msg="Mouse Button is Released";
		repaint();
	}
	public void mouseDragged(MouseEvent ME)
	{
		x=ME.getX();
		y=ME.getY();
		msg="Mouse Button is Dragged";
		showStatus("Mouse is moved at "+ME.getX()+", "+ME.getY());
		repaint();
	}

	public void mouseMoved(MouseEvent ME)
	{
		showStatus("Mouse is moved at "+ME.getX()+", "+ME.getY());
		repaint();
	}


	public void paint(Graphics G)
	{
		G.drawString(msg,x,y);
	}
}