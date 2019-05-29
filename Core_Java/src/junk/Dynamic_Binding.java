package junk;

//below is the super class

class Animal
{
	public void AnimalM(){System.out.println("This the Animal Kindom");}
}

class dog extends Animal
{
	public void AnimalM(){System.out.println("This is Dog Kindom");}
}


public class Dynamic_Binding {

	public static void main(String[] args) {
		// below is the code to for the dynmic Binding
		Animal Obj =  new dog();
		Obj.AnimalM();

	}

}
