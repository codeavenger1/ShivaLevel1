
/*
 * 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

public class Spongebob {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		Spongebob.eat();
		Spongebob.laugh();

		SeaCreature Patrick = new SeaCreature("Pat" + "rick");
		Patrick.eat();
		Patrick.laugh();

		SeaCreature Squidward = new SeaCreature("Squidward");
		Squidward.eat();
		Squidward.laugh();

	}
}