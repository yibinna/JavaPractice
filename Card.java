import java.util.Random;

public class Card {
private String suit;
private String face;

String MyfaceArray[] = {"1","2","3","4","5","6","7","8","9","10","Queen","King","Joker","Ace"};
String MysuitArray[] = {"Hearts","Spades","Diamonds","Clubs"};


public Card (String suit, String face) {
	
	Random cardd = new Random();
	int cardone = cardd.nextInt(MyfaceArray.length);
	int cardtwo = cardd.nextInt(MysuitArray.length);	

	this.face = MyfaceArray[cardone];
	this.suit = MysuitArray[cardtwo];
}
public String toString() { 
	String conjunction = " of ";
	return face+ " " + conjunction + " " + suit; 
}
}

