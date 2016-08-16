package fi.jamk.iio123000.g8499.ht2;

public class HelloHT2 {
	String Testaus = "Testaus ";
	String On = "on ";
	String Kivaa = "kivaa!";
	
	int korkeus1 = 1568;
	int korkeus2 = 0;
	
	HelloHT2 hello = null;
	HelloHT2 hello2 = null;
	HelloHT2 hello3 = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloHT2 hello = new HelloHT2();
		HelloHT2 hello2 = null;
		HelloHT2 hello3 = new HelloHT2();
		hello.print();
		
	}
	
	public String print()
	{
		System.out.println("Testaus on kivaa!");
		return (Testaus+On+Kivaa);
	}
	
	public int getkorkeus1() {
		return korkeus1;
	}

	public void setkorkeus1(int korkeus1) {
		this.korkeus1 = korkeus1;
	}

	public int getkorkeus2() {
		return korkeus2;
	}

	public void setkorkeus2(int korkeus2) {
		this.korkeus2 = korkeus2;
	}
	
	public HelloHT2 getHello() {
		return hello;
	}

	public HelloHT2 getHello2() {
		return hello2;
	}

	public HelloHT2 getHello3() {
		return hello3;
	}

	public String getTestaus() {
		return Testaus;
	}
	
	
}
