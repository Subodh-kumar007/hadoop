import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=KEYBOARD height=500 width = 500>
</applet>*/
public class KEYBOARD extends Applet implements KeyListener
{
	String msg=" ";
	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}

	public void keyPressed(KeyEvent KE)
	{
		showStatus("Key Pressed");
	}

	public void keyReleased(KeyEvent KE)
	{
		showStatus("Key Released");
	}

	public void keyTyped(KeyEvent KE)
	{
		msg=msg+KE.getKeyChar();;//read the keystroke
		repaint();
	}

	public void paint(Graphics G)
	{
		G.drawString(msg,100,20);
	}
}