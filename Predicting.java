package www;

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Predicting {
	public static void main(String[] args) {

		Random rand = new Random(); //instance of random class
      int upperbound = 32;
        //generate random values from 0-31
		
		Team home;
		Team away;
		Team predict;
		Scanner keyScan = new Scanner(System.in);
		Scanner sc= new Scanner(System.in);
		boolean resume;
		boolean equal;
		boolean incorrect;
		boolean repeat;
		repeat = true;
		incorrect = true;
		resume = true;
		equal = true;
		int ht;
		int at;
		
		Scanner keyboard = new Scanner(System.in);
		
		League nfl = new League();



//this assigns the 2 random integers to their corresponding teams
//this is the big do while loop
do {

	//this makes sure the two teams aren't the same
	do{
		int int_random = rand.nextInt(upperbound);
		int int_random2 = rand.nextInt(upperbound);
	  
	  while(int_random == int_random2){
		  int_random2 = rand.nextInt(upperbound);
		  int_random = rand.nextInt(upperbound);
	  }
	  ht = int_random;
	  at = int_random2;
	  System.out.println("The 2 random integers are " + ht + " and " + at);
	  equal = false;
	  }	while(equal);

System.out.println("The home team is:");
home = nfl.getTeam1(ht);
System.out.println(home);
System.out.println("\n");
System.out.println("The away team is:");
away = nfl.getTeam1(at);
System.out.println(away);

//then we ask the user which team they think will win
System.out.println("Who do you think will win?");
String team3 = keyboard.nextLine();
predict = nfl.getTeam(team3);

//this ensures that they answer with one of the two possible teams
do{
	if(team3.equals(home.getName()) || team3.equals(away.getName())){
System.out.println("You think the " + team3 + " will win.");
incorrect = false;
	}
	else{
		System.out.println("Please enter one of the two possible teams.");
		team3 = keyboard.nextLine();
		incorrect = true;
	}
} while(incorrect);

double pH;
double pA;
pH = .525;
pA = .475;

if(home.getWins() > away.getWins()) {
	pH = pH + .05;
	pA = pA - .05;
}
else if (home.getWins() < away.getWins()) {
	pH = pH - .05;
	pA = pA + .05;
}

if(home.getWins() < 3 && away.getWins() > 9) {
	pH = pH - .05;
	pA = pA + .05;
}
else if(away.getWins() < 3 && home.getWins() > 9) {
	pH = pH + .05;
	pA = pA - .05;
}

if(home.getWins() < 6 && away.getWins() > 8) {
	pH = pH - .015;
	pA = pA + .015;
}
else if(away.getWins() < 6 && home.getWins() > 8) {
	pH = pH + .015;
	pA = pA - .015;
}

if(home.getInjuries() > away.getInjuries()) {
	pH = pH - .05;
	pA = pA + .05;
}
else if(home.getInjuries() < away.getInjuries()) {
	pH = pH + .05;
	pA = pA - .05;
}

if(home.getAge() < away.getAge()) {
	pH = pH + .025;
	pA = pA - .025;
}
else if(home.getAge() > away.getAge()) {
	pH = pH - .025;
	pA = pA + .025;
}

if(home.getfieldGoals() > away.getfieldGoals()) {
	pH = pH + .025;
	pA = pA - .025;
}
else if(home.getfieldGoals() < away.getfieldGoals()) {
	pH = pH - .025;
	pA = pA + .025;
}

if(home.getProBowl() > away.getProBowl()) {
	pH = pH + .05;
	pA = pA - .05;
}
else if(home.getProBowl() < away.getProBowl()) {
	pH = pH - .05;
	pA = pA + .05;
}

if(home.getTurn() > away.getTurn()) {
	pH = pH + .1;
	pA = pA - .1;
}
else if(home.getTurn() < away.getTurn()) {
	pH = pH - .1;
	pA = pA + .1;
}

if(home.getPoint() > away.getPoint()) {
	pH = pH + .1;
	pA = pA - .1;
}
else if(home.getPoint() < away.getPoint()) {
	pH = pH - .1;
	pA = pA + .1;
}

//we say the percentages
System.out.println("We believe that:");
	System.out.println(home.getName() + " has a " + 100*pH + "% chance of winning");
	System.out.println(away.getName() + " has a " + 100*pA + "% chance of winning");

	//we find out if the program agrees or disagrees with them

	do{
if(pH >= .5 && team3.equals(home.getName())){
	System.out.println("We agree, we think the " + team3 + " will win.");
	System.out.println("Would you like to wager on another game?" + "\n[yes / no]");
	String again = keyScan.next();
	if(again.equalsIgnoreCase("yes")){
		break;
	}
	else if(again.equalsIgnoreCase("no")){
	resume = false;
	repeat = false;
	}
}

else if(pH < .5 && team3.equals(home.getName())){
	System.out.println("We disagree, we think the " + away.getName() + " will win."
	+ "\n Would you like to place a wager? + [yes / no]");
	String again = keyScan.next();
	if(again.equalsIgnoreCase("yes")){
		System.out.println("How much would you like to bet");
		int bet = sc.nextInt();
		System.out.println("You would like to bet $" + bet + " on the " + away.getName() + " to beat the " + home.getName());
		System.out.println("Correct?" + "     [yes / no]");
		String correct = keyScan.next();
		if(again.equalsIgnoreCase("yes")){
			System.out.println("Ok! You're bet has been processed!");
			resume = false;
			repeat = false;
			}
		else if(again.equalsIgnoreCase("no")){
		System.out.println("Ok, let's try again.");
		break;
		}
	}
	else if(again.equalsIgnoreCase("no")){
	repeat = false;
	}
}

else if(pA >= .5 && team3.equals(away.getName())){
	System.out.println("We agree, we think the " + team3 + " will win.");
	System.out.println("Would you like to wager on another game?" + "\n[yes / no]");
	String again = keyScan.next();
	if(again.equalsIgnoreCase("yes")){
	break;
	}
	else if(again.equalsIgnoreCase("no")){
		resume = false;
		repeat = false;
	}
}

else if(pA < .5 && team3.equals(away.getName())){
	System.out.println("We disagree, we think the " + home.getName() + " will win."
	+ "\n Would you like to place a wager? + [yes / no]");
	String again = keyScan.next();
	if(again.equalsIgnoreCase("yes")){
		System.out.println("How much would you like to bet");
		int bet = sc.nextInt();
		System.out.println("You would like to bet $" + bet + " on the " + away.getName() + " to beat the " + home.getName());
		System.out.println("Correct?" + "     [yes / no]");
		String correct = keyScan.next();
		if(again.equalsIgnoreCase("yes")){
			System.out.println("Ok! You're bet has been processed!");
			resume = false;
			repeat = false;
			}
		else if(again.equalsIgnoreCase("no")){
		System.out.println("Ok, let's try again.");
		break;
		}
	}
	else if(again.equalsIgnoreCase("no")){
	repeat = false;
	}
}
	}while(repeat);
		
	//this is the final do while loop of the code
		}
		while(resume);

		System.out.println("Thank you for playing. FIN.");
	
}
}