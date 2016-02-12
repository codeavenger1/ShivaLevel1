// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurfs {

	private String name;
	String hat;
	private String gender;
	public static void main(String[] args) {
		Smurfs Handy = new Smurfs("Handy", "", "boy");
		Handy.getName();
		Handy.eat();
		
		Smurfs Papa = new Smurfs("Papa", "red", "boy");
			String PapaName = Papa.getName();
			System.out.println(PapaName);
		String HatColor = Papa.getHatColor();
		System.out.println("My hat color is " + HatColor + ".");
			String gender = Papa.isGirlOrBoy();
			System.out.println("I am a " + gender + ".");
			
			Smurfs Smurfette = new Smurfs("Smurfette", "white", "girl");
			String name1 = Smurfette.getName();
			System.out.println("" + name1);
			String hatColor = Smurfette.getHatColor();
			System.out.println("I have a " + hatColor + " hat.");
			String girl = Smurfette.isGirlOrBoy();
			System.out.println("I am a " + girl + ".");
	}
	
	
 
	Smurfs(String name, String hat,String gender ) {
		this.name = name;
		this.hat = hat;
		this.gender = gender;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		return hat;
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		return gender;
	}

}
