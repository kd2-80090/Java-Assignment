package com.sunbeam.que3;


/*
 * OPTIONAL - OOP ASSIGNMENT Create an abstract Player class with id, name, age, and matchesPlayed as ﬁelds. Create a Batter interface with methods
like getRuns(), getAverage(), and getStrikeRate(). Creater a Bowler interface with methods like getWickets(), and getEconomy(). Create a class Cricketer
inherited from Player as well as Batter and Bowler interfaces. In all classes write appropriate constructors, getter/setters, accept(), toString(), and
equals() methods. In main(), create a team (array) of 11 players and input their details from end user. Create a new (utilility) class Players that contains
static methods to count number of batters, number of bowlers, total batter runs, total bowler wickets, return a batter with maximum runs, and return a
bowler with maximum wickets. Following code snippets can be helpful.
 
 *class Players {
	public static int batterTotalRuns(Player[] arr) {
	int runs = 0;
	for(Player p:arr) {
		if(p instanceof Batter) {
			Batter b = (Batter)p;
			runs = runs + b.getRuns();
		}
	}
	return runs;
	}
	public static int bowlerTotalWickets(Player[] arr) {
	// ...
	}
	public static int countBatters(Player[] arr) {
	// ...
	}
	public static int countBowlers(Player[] arr) {
	// ...
	}
	public static Player maxRunBatter(Player[] arr) {
	// ...
	}
	public static Player maxWicketBowler(Player[] arr) {
	// ...
	}
}


class Program {
public static void main(String[] args) {
// ...
	Player[] team = new Player[11];
	for(int i=0; i<team.length; i++) {
	System.out.print("Enter 1 for batter and 2 for bowler: ");
	int choice = sc.nextInt();
	if(choice == 1)
	arr[i] = new Batter();
	else
	arr[i] = new Bowler();
	arr[i].accept();
	}
	for(Player p:team)
	System.out.println(p.toString());
	int totalRuns = Players.batterTotalRuns(team);
	System.out.println("Total runs of all batters: " + totalRuns);
	// ...
	}
}
 *
 */


