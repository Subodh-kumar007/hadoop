import java.applet.*;
import java.awt.*;
import java.awt.Image;
/*
<applet code="testApplet3" height=500 width	=500></applet>
*/
public class testApplet3 extends Applet
{
	Image picture;
	public void init(){
		picture=getImage(getCodeBase(),"C:\\Users\\Infotech\\Pictures\\image.jpeg");
	}
	public void paint(Graphics S)
	{
		S.drawImage(picture,30,30,this);
	}
} 