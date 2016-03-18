
public class Superhero {
	
	
		String name;
		String power;
	
	
	Superhero(String name, String power)
{
	this.name = name;
	this.power = power;
}
	
	String getName(){
		return name;
	}
	
	void setName(String myName){
		this.name = myName;
	}
	
	String getPower(){
		return power;
	}
	
	void setPower(String myPower){
		this.power = myPower;
	}
	
	public String toString(){
		return name + " has mad " + power + " skillz!!!!!";
		
	}
}