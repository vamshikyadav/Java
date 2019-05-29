package junk;

// below is the program for the interface
interface Inter{
	void a();
	void b();
	void c();
	void d();
}

abstract class Abs implements Inter{
	public void c(){System.out.println("C in the abstract");}
}

class Rest extends Abs{
	public void a(){System.out.println("a in the Interface inheritence");}
	public void b(){System.out.println("B in the Interface inheritence");}
	public void d(){System.out.println("d in the Interface inheritence");}
}

public class Interface_Abstract {

	public static void main(String[] args) {
		// below is the way to print all the data in the abstract and the genereal method
		Inter obj =new Rest();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

}
