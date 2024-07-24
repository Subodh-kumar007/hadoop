//Accessing single class when package have mulitple class
import myPackage.testPack;
import myPackage.testPack1;
class testMain2
{
	public static void main(String[] args) {
		testPack T=new testPack();
		T.show();

		testPack1 T1=new testPack1();
		T1.show();
	}
}