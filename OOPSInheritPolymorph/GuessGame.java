package OOPSInheritPolymorph;

import java.util.Scanner;
public class GuessGame {
	private int numberToGuess;
    private Player p1;
    private Player p2;
    private Player p3;

    public void startGame(){
    	Scanner sc = new Scanner(System.in);
        numberToGuess = (int) (Math.random()*10);
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        System.out.println("Enter player one name-");
        p1.setPlayerName(sc.nextLine());
        System.out.println("Enter player two name-");
        p2.setPlayerName(sc.nextLine());
        System.out.println("Enter player three name-");
        p3.setPlayerName(sc.nextLine());

        int flagWinner = 0;
        while(0==flagWinner){
            p1.guessNumber();
            if (p1.getNumber()==numberToGuess){
                flagWinner = 1;
                break;
            }
            System.out.println(p1.getPlayerName()+", your guess is wrong");
            p2.guessNumber();
            if (p2.getNumber()==numberToGuess){
                flagWinner = 2;
                break;
            }
            System.out.println(p2.getPlayerName()+", your guess is wrong");
            p3.guessNumber();
            if (p3.getNumber()==numberToGuess){
                flagWinner = 3;
                break;
            }
            System.out.println(p3.getPlayerName()+", your guess is wrong");
        }
        if (1 == flagWinner){
        	System.out.println(p1.getPlayerName()+", you win!");
        } else if (2 == flagWinner){
        	System.out.println(p2.getPlayerName()+", you win!");
        } else 
        	System.out.println(p3.getPlayerName()+", you win!");
    }
}
