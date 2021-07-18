package superkeyword.methodcall;

class Animal{

	 void sound(){
	 
	 System.out.println("Sounds of Animal");
	 }

	}
	 class Dog extends Animal{

	 void sound(){
	 super.sound();
	 System.out.println("Sound of Dog");
	 }

	}
	 
	public class AnimalDemo{
	 
	public static void main(String args[]){

		Dog dobj = new Dog();
		dobj.sound();
	}

	}