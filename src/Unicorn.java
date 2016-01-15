
public class Unicorn {
	String Color;
	int age;
	
public static void main(String[] args) {
	
	Unicorn uni = new Unicorn("pink");
	uni.sing("pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows.pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows.pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows.pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows.pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows.pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows. pink fluffy unicorn dancing on rainbows.");
}

public Unicorn(String theColor)
{
Color = theColor;
age = 4;
}


void sing(String words) {
	speak(words);

}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014

