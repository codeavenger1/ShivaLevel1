import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Skyline {
public static void main(String[] args) {
	
	Tortoise.setSpeed(10);
	
		int move = new Random().nextInt(200);
		Skyline skyline = new Skyline();
		skyline.drawBuilding("small", Colors.Pinks.Fuchsia);
		skyline.drawBuilding("tiny", Colors.Pinks.HotPink);
		skyline.drawBuilding("small", Colors.Pinks.PaleVioletRed);
		skyline.drawBuilding("giant", Colors.Pinks.MediumVioletRed);
		skyline.drawBuilding("tiny", Colors.Pinks.Fuchsia);
		skyline.drawBuilding("huge", Colors.Pinks.PaleVioletRed);
		skyline.drawBuilding("meduim", Colors.Pinks.Pink);
		skyline.drawBuilding("huge", Colors.Pinks.DeepPink);
		skyline.drawBuilding("small", Colors.Pinks.LightPink);
		skyline.drawBuilding("medium", Colors.Pinks.MediumVioletRed);
		skyline.drawBuilding("huge", Colors.Pinks.MediumVioletRed);
		skyline.drawBuilding("small", Colors.Pinks.LightPink);
		skyline.drawBuilding("medium", Colors.Pinks.HotPink);
		skyline.drawBuilding("huge", Colors.Pinks.DeepPink);
		skyline.drawBuilding("tiny", Colors.Pinks.Fuchsia);
		skyline.drawBuilding("medium", Colors.Pinks.HotPink);
		skyline.drawBuilding("giant", Colors.Pinks.PaleVioletRed);
		skyline.drawBuilding("tiny", Colors.Pinks.Pink);
		skyline.drawBuilding("large", Colors.Pinks.MediumVioletRed);
		skyline.drawBuilding("small", Colors.Pinks.Fuchsia);
		skyline.drawBuilding("medium", Colors.Pinks.HotPink);
	
	}

void drawBuilding (String size, Color color)
{
	Tortoise.setPenColor(color);
	int move = 0;
	if (size.equals("tiny")) {
		move = 50;
	}
	
	if (size.equals("small")) {
		move = 75;
	}
	
	if (size.equals("medium")){
		move = 100;
	}
	
	if (size.equals("large")) {
		move = 150;
	}
	
	if (size.equals("huge")) {
		move = 180;
	}
	
	if (size.equals("giant")) {
		move = 200;
	}
	
	Tortoise.move(move);
	Tortoise.turn(90);
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(move);
	Tortoise.turn(-90);
	Tortoise.move(40);
	Tortoise.turn(270);

}
}
