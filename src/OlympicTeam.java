
public class OlympicTeam {
	public static void main(String[] args) {
		Olympian Franklin = new Olympian("Missy Franklin", 1, "Swimming", true, 21, "USA");
		Olympian Ledecky = new Olympian("Katie Ledecky", 4, "Swimming", true, 19, "USA");
		Olympian King = new Olympian("Lily King", 0, "Swimming", true, 19, "USA");
		Olympian Schmitt = new Olympian("Allison Schmitt", 4, "Swimming", true, 26, "USA");
		Olympian Ervin = new Olympian("Anthony Ervin", 35, "Swimming", false, 2, "USA");

		Franklin.Perform();
		Ledecky.Perform();
		King.Perform();
		Schmitt.Perform();
		Ervin.Perform();
	}
}
