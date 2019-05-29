package local_GIT_App;


interface one {
	void print();
}

interface two {
	void Show();
}

// below class inherits both the interfaces

class inherit implements one, two{
	public void print(){System.out.println("This the value of the print inherited");}
	public void Show(){System.out.println("This the value of the Show inherited");}
}


public class Interface_MultipleInhert {

	public static void main(String[] args) {
		// Below is the calling for bothe of the class
		inherit obj = new inherit();
		obj.print();
		obj.Show();

	}

}
