package junk;
// below is the interface
interface Printable{};

class A implements Printable{void a(){System.out.println("A method");}}
class B implements Printable{void b(){System.out.println("B method");}}

//Downsizing below

class Call
{
	void invoke(Printable p){
		if(p instanceof A){
			A a=(A)p;
			a.a();
		} 
		if (p instanceof B){
			B b=(B)p;
			b.b();
		}
	}
}

public class InstanceOf {

	public static void main(String[] args) {
		// Below is the dowsize call for the interface and class
		Printable p = new B();
		Call c = new Call();
		c.invoke(p);	
		
	}

}
