
public class Olympian {

	int bibNumber;
	static int number = 0;
	String name;
	int numberOfGoldMedals;
	String typeOfSport;
	Boolean girl;
	int Age;
	String country;

	public Olympian(String name, int numberOfMedals, String typeOfSport, Boolean girl, int Age, String country) {
		this.name = name;
		this.numberOfGoldMedals = numberOfMedals;
		this.typeOfSport = typeOfSport;
		this.girl = girl;
		this.Age = Age;
		this.country = country;
		number++;
		bibNumber = number;
	}

	void Perform() {
		System.out.println(
				"#" + bibNumber + " " + name + " - " + name + " had come to the Olympics to compete in " + typeOfSport
						+ ", " + "has " + numberOfGoldMedals + " gold medal, and is " + Age + ". Go " + country + "!");
	}
}