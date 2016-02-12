
public class PetPlatypus {
	private String name;

	PetPlatypus(String PlatiName)
	{
		name = PlatiName;
	}
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		PetPlatypus platypi = new PetPlatypus("Patti");
		//2. Call the sayHi method
		platypi.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
	
}

