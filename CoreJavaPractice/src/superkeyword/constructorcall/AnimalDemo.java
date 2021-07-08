package superkeyword.constructorcall;


class Animal{
	
	//constructor
	Animal(){
		System.out.println("animal is created");
	}
}

class Dog extends Animal{
	
	Dog(){
	
	super(); //call the Animal constructor	
	System.out.println("Dog is created");	
	}

}
public class AnimalDemo{
 
public static void main(String args[]){

	Dog dobj = new Dog();
}

}