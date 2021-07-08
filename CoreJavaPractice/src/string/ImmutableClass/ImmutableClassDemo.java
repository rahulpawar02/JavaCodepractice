package string.ImmutableClass;

final class ImmutableClassDemo {

	final private int i; //all field make as final and private
	
	ImmutableClassDemo(int i){ //initialize constructor with all fields for deep copy
		this.i = i;
	}
	
	public ImmutableClassDemo modify(int i) {
		
		if(this.i == i) {
			return this; //refer the same object
		}else {
			return (new ImmutableClassDemo(i));//here new object created with passed value
		}
	}
	
	public static void main(String[] args) {
		
		ImmutableClassDemo itm1 = new ImmutableClassDemo(10);
		ImmutableClassDemo itm2 = itm1.modify(100); //here new object created with passed value
		
		ImmutableClassDemo itm3 = itm1.modify(10); //here itm3 i.e this new reference variable reffer the same object. 
		System.out.println(itm1==itm2);//false
		System.out.println(itm1==itm3);//true
	}

}
