import java.util.Scanner;

class Guesser{
	int guessnum;
	public int Guess() {
		
		Scanner scan=new Scanner(System.in);
		guessnum=scan.nextInt();
		return guessnum;
		
	}
}
class Player{
	int playernum;
	public int Play() {
		Scanner scan=new Scanner(System.in);
		playernum=scan.nextInt();
		return playernum;
	}
}
class Umpire{
	int guessernumber,playernumber1,playernumber2,playernumber3;
	

	public void Umpirecom() {
		
		System.out.println("Guesser guess a no:");
		Guesser guessern=new Guesser();
		guessernumber=guessern.Guess();
		
		System.out.println("Player guess the no:");
		Player playern=new Player();
		playernumber1=playern.Play();
		playernumber2=playern.Play();
		playernumber3=playern.Play();
		}
	public void Umpirecompare() {
		
		if(playernumber1==guessernumber)
		{
			if(playernumber2==guessernumber)
			{
				if(playernumber3==guessernumber)
				{
					System.out.println("All the three players won the game");
					System.exit(0);
				}
				else
				{
					System.out.println("Both player1 and player2 won the game");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Player1 won the game");
				System.exit(0);
			}
		}
		else if(playernumber2==guessernumber)
		{
			if(playernumber3==guessernumber)
			{
				System.out.println("Both player2 and player3 won the game");
				System.exit(0);
			}
			else
			{
				System.out.println("Player2 won the game");
				System.exit(0);
			}
		}
		else if(playernumber3==guessernumber)
		{
			System.out.println("Player3 won the game");
			System.exit(0);
		}
		else
		{
			System.out.println("Game lost!Try again");
		}
	}
		
		
}



public class Game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		while(x>0)
		{
			
			Umpire a=new Umpire();
			a.Umpirecom();
			a.Umpirecompare();
		}

	}

}
