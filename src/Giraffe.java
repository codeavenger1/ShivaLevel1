
public class Giraffe {

	String color;
	int age;
	Boolean isMale;
	String longNeck;
	String name;
	Giraffe(String color, int age, Boolean isMale, String longNeck, String name) {
		this.color = color;
		this.age = age;
		this.isMale = isMale;
		this.longNeck = longNeck;
		this.name = name;
		
	}
	
	void walk(){
	System.out.println("I am walking over to a tree.");
	}
	
	void getLeaves(){
		System.out.println("I am now taking the leaves from the tree.");
	}
	
	void eat(){
	System.out.println("The leaves are now in my mouth.");
	}
	
	void chew(){
		System.out.println("I have now chewed and swallowed my leaves");
	}
}
