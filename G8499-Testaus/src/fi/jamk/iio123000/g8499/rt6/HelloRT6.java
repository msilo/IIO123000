// Test7
package fi.jamk.iio123000.g8499.rt6;

public class HelloRT6 {
	String Testaus = "Testaus ";
	String On = "on ";
	String Kivaa = "kivaa!";
	
	int arvo1 = 1568;
	int arvo2 = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloRT6 hello = new HelloRT6();
		hello.print();
		
	}
	
	public String print()
	{
		System.out.println("Testaus on kivaa!");
		return (Testaus+On+Kivaa);
	}
	
	public int getArvo1() {
		return arvo1;
	}

	public void setArvo1(int arvo1) {
		this.arvo1 = arvo1;
	}

	public int getArvo2() {
		return arvo2;
	}

	public void setArvo2(int arvo2) {
		this.arvo2 = arvo2;
	}
}
