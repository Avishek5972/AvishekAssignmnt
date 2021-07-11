package OOPSInheritPolymorph;

import java.util.Scanner;
public class Player {
	String playerName;
	int number;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void guessNumber()
	{
		Scanner sc = new Scanner (System.in);
		Player p = new Player();
		System.out.println("Enter the number that you guess");
		p.setNumber(sc.nextInt());
	}

}
