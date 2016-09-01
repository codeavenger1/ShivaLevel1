public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
			Human dumb = new Human("Eshaan");
			Human dumber = new Human("Eshaan(--The dumber triplet)");
		//2. create a new Robot army of good and evil robots.
			Robot good = new Robot("Shiva", false);
			Robot bad = new Robot("Zelda", true);
			Robot bad1 = new Robot("The Eshaan Triplet", true);
		//3. command your robot army to destroy a human
			good.destroy(dumb);
			bad1.destroy(dumber);
			
			
			bad.battle(bad1);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	private int Power;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
	
	void battle(Robot r){
		
		if(	Power > r.Power){
			System.out.println("Uh oh! Looks like we have a situation! And " + r + " strikes the first move, but,-- Oh No! It looks like "+ Power + "fight back, taking " + r + " down!");
		}
		else {
			System.out.println("Uh oh! Looks like we have a situation! And " + Power + " strikes the first move, but,-- Oh No! It looks like "+ r + "fight back, taking " + Power + " down!");
		}
	}
}

