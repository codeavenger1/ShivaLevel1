import org.omg.Messaging.SyncScopeHelper;

public class iRock {
public static void main(String[] args) {
iRock rocks = new iRock();
	rocks.iRock("Shiva");
	
	rocks.truth("Taylor Swift");
	
	rocks.echo("candy");
	
	rocks.repeat("bingo");
	
	String bestCoder = rocks.getTheBest();
	System.out.println(bestCoder);
	
	rocks.add(2,3);
	
	rocks.even(68);
	
	rocks.addDouble(2);
}
void iRock(String name){
System.out.println(name+" rocks!");
}
void truth(String favSinger){
	if (favSinger.equals("Taylor Swift")) {
		System.out.println(favSinger + " is awesome!");
	}
	else {
		System.out.println(favSinger + " is annoying!");
	}
}
void echo(String word){
	System.out.println(word+" "+word);
}
void repeat(String word){
	for (int i = 0; i < 5; i++) {
		System.out.println(word);
	}}
public String getTheBest(){
return "bestCoder";
}
void add(int addend, int addend1){
	System.out.println(addend + addend1);
}
void even(int evenNum){
	if (evenNum%2 == 0) {
		System.out.println(evenNum +" is even");
	}
	else {
		System.out.println(evenNum + " is odd");
	}}
void addDouble(int addend2){
	System.out.println((addend2 + addend2) * 2);
}
}































































